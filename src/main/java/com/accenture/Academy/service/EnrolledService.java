package com.accenture.academy.service;

import com.accenture.academy.model.Academic;
import com.accenture.academy.model.Enrolled;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnrolledService {
    public Enrolled createEnrolled(Integer id,  String status,Integer time,
                                   Integer academicId, Integer courseId);
    public List<Enrolled> getAll(Integer id);
    public Enrolled updateEnrolled( Integer academicId,Integer courseId, Enrolled newEnrolled);

}
