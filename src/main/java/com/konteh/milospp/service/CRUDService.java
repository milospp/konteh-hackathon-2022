package com.konteh.milospp.service;

import java.util.Collection;
import java.util.List;

public interface CRUDService<T> {
    List<T> findAll();
    T findOne(String id);
    T save(T entity);
    T update(T entity);
    List<T> saveAll(Collection<T> entities);
    void delete(String id);
}
