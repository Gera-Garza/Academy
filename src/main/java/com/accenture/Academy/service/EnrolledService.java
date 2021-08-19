package com.accenture.academy.service;

import com.accenture.academy.model.Academic;
import com.accenture.academy.model.Enrolled;
import org.springframework.data.repository.query.Param;

public interface EnrolledService {
    public Enrolled createEnrolled(Integer id,  String status,Integer time,
                                   Integer academicId, Integer courseId);
    public Iterable<Enrolled> getAll(Integer id);
    public Enrolled updateEnrolled( Integer academicId,Integer courseId, Enrolled newEnrolled);

}
