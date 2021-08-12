package com.accenture.academy.controller;

import com.accenture.academy.model.Academic;
import com.accenture.academy.model.Course;
import com.accenture.academy.repository.AcademyRepository;
import com.accenture.academy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/academic")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping(path = "/course")
    public @ResponseBody Course createCourse(@RequestBody Course newCourse){
        return courseRepository.save(newCourse);
    }

    @GetMapping()
    public @ResponseBody Iterable<Course> getALl(){
        return courseRepository.findAll();
    }

    @GetMapping(path = "/{language}")
    @Query("select * from courses where language = %:language")
    public @ResponseBody Course getCourseByLanguage(@PathVariable String language) {
        return courseRepository.findByLanguage(language);
    }

    @GetMapping(path = "/{id}/course")
    @Query("select * from courses where ac_id = id")
    public @ResponseBody Iterable<Course> getAcademicCourses(){
            return courseRepository.findAll();
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody Course updateCourse(@PathVariable Integer id, @RequestBody Course updateCourse) {
        Course course = courseRepository.findById(id).get();

        course.setName(updateCourse.getName());
        course.setDescription(updateCourse.getDescription());

        return courseRepository.save(course);
    }
    @DeleteMapping(path = "{id}")
    public @ResponseBody Integer deleteCourse(@PathVariable Integer id) {
        Course course = courseRepository.findById(id).get();
        courseRepository.delete(course);
        return course.getId();
    }
}
