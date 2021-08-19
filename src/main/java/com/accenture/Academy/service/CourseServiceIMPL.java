package com.accenture.academy.service;

import com.accenture.academy.model.Course;
import com.accenture.academy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{


    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course findByLanguage(String language) {
        return courseRepository.findByLanguage(language);
    }

    @Override
    public Course createCourse(Course newCourse){
        return courseRepository.save(newCourse);
    }
    @Override
    public Iterable<Course> getALl(){
        return courseRepository.findAll();
    }
   @Override
    public Course updateCourse( Integer id, Course updateCourse){
        Course course = courseRepository.findById(id).get();

        course.setName(updateCourse.getName());
        course.setDescription(updateCourse.getDescription());
        return course;

   }
   @Override
   public Integer deleteCourse( Integer id){
       Course course = courseRepository.findById(id).get();
       courseRepository.delete(course);
       return id;
   }
}
