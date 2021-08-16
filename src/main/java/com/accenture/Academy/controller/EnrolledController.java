package com.accenture.academy.controller;

import com.accenture.academy.model.Course;
import com.accenture.academy.repository.enrolledRepository;
import com.accenture.academy.repository.EnrolledRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/academic/enrolled")
public class EnrolledController {

    @Autowired
    private EnrolledRepository enrolledRepository;

    @PostMapping(path = "/course")
    public @ResponseBody
    Course createCourse(@RequestBody Course newCourse){
        return enrolledRepository.save(newCourse);
    }

    @GetMapping()
    public @ResponseBody Iterable<Course> getALl(){
        return enrolledRepository.findAll();
    }


    @GetMapping(path = "/{id}/course")
    @Query("select * from courses where ac_id = id")
    public @ResponseBody Iterable<Course> getAcademicCourses(){
        return enrolledRepository.findAll();
    }

    @DeleteMapping(path = "{id}")
    public @ResponseBody Integer deleteCourse(@PathVariable Integer id) {
        Course course = enrolledRepository.findById(id).get();
        enrolledRepository.delete(course);
        return course.getId();
    }
}