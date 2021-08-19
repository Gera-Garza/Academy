package com.accenture.academy.service;

import com.accenture.academy.model.Course;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public interface CourseService {

    public Course createCourse(Course newCourse);
    public Iterable<Course> getALl();
    public Course findByLanguage(String language);
    public Course updateCourse( Integer id, Course updateCourse);
    public Integer deleteCourse( Integer id);

}
