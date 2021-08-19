package com.accenture.academy.service;

import com.accenture.academy.model.Academic;
import com.accenture.academy.model.Course;
import com.accenture.academy.model.Enrolled;
import com.accenture.academy.repository.AcademyRepository;
import com.accenture.academy.repository.EnrolledRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

public class EnrolledServiceImp implements EnrolledService{

    @Autowired
    private EnrolledRepository enrolledRepository;



    @Override
    public Enrolled createEnrolled(Integer id,Integer academicId, Integer courseId, String status, Integer time, ) {
        Enrolled enrolled = new Enrolled(id,academicId,courseId,status,time);
    }

    @Override
    public Iterable<Enrolled> getALl(Integer id) {
        return enrolledRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public Enrolled updateEnrolled(Integer academicId,Integer courseId, Enrolled newEnrolled) {
        Enrolled enrolled = enrolledRepository.findById(academicId).get();

       enrolled.setStatus(newEnrolled.getStatus());
       enrolled.setTimeDedicated(newEnrolled.getTimeDedicated());
        return enrolledRepository.save(enrolled);
    }
}
