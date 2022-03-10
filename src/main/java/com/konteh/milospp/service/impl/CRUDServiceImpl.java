package com.konteh.milospp.service.impl;

import com.konteh.milospp.exception.BadRequestException;
import com.konteh.milospp.exception.NotFoundException;
import com.konteh.milospp.model.BaseEntity;
import com.konteh.milospp.service.CRUDService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CRUDServiceImpl<T extends BaseEntity> implements CRUDService<T> {
    protected abstract JpaRepository<T, String> getEntityRepository();

    @Override
    @Transactional(readOnly = true)
    public List<T> findAll() {
        return (List<T>) getEntityRepository().findAll().stream().filter(n -> n.getActive()).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public T findOne(String id) {
        return findActiveEntity(id);
    }

    @Override
    @Transactional
    public T save(T entity) {
        return getEntityRepository().save(entity);
    }

    @Override
    public List<T> saveAll(Collection<T> entities) {
        return getEntityRepository().saveAll(entities);
    }

    @Override
    @Transactional
    public T update(T entity) {
        return save(entity);
    }

    @Override
    @Transactional
    public void delete(String id) {
        var entity = findOne(id);
        entity.setActive(false);
        save(entity);
//        getEntityRepository().delete(findOne(id));
    }

    private T findActiveEntity(String id) {
        var entity = getEntityRepository().findById(id).orElseThrow(() -> new BadRequestException("Cannot find entity with id: " + id));
        if (Boolean.TRUE.equals(entity.getActive()))
            return entity;

        throw new NotFoundException("Cannot find entity with id: " + id);
    }


}
