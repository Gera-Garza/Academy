package com.accenture.academy.service;

import com.accenture.academy.model.Academic;
import com.accenture.academy.model.Course;
import com.accenture.academy.model.Enrolled;
import com.accenture.academy.repository.AcademyRepository;
import com.accenture.academy.repository.EnrolledRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class EnrolledServiceImp implements EnrolledService{

    @Autowired
    private EnrolledRepository enrolledRepository;


    /*@Override
    public Iterable<Enrolled> getALl(Integer id) {
        return enrolledRepository.findAllById(Collections.singleton(id));
    }*/

    @Override
    public Enrolled createEnrolled(Integer id, String status, Integer time, Integer academicId, Integer courseId) {
        enrolledRepository.createEnrolled(id,status,time,academicId,courseId);
        return enrolledRepository.findById(id).get();
    }

    @Override
    public List<Enrolled> getAll(Integer id) {
        List<Enrolled> test = enrolledRepository.getALl(id);
        return test;
    }

    @Override
    public Enrolled updateEnrolled(Integer academicId,Integer courseId, Enrolled newEnrolled) {
        Enrolled enrolled = enrolledRepository.findById(academicId).get();

       enrolled.setStatus(newEnrolled.getStatus());
       enrolled.setTimeDedicated(newEnrolled.getTimeDedicated());
        return enrolledRepository.save(enrolled);
    }
}
