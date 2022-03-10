package com.konteh.milospp.service.impl;

import com.konteh.milospp.model.Faculty;
import com.konteh.milospp.repository.FacultyRepository;
import com.konteh.milospp.service.FacultyService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FacultyServiceImpl extends JPAServiceImpl<Faculty> implements FacultyService {
    private final FacultyRepository facultyRepository;

    @Override
    protected JpaRepository<Faculty, String> getEntityRepository() {
        return facultyRepository;
    }
}
