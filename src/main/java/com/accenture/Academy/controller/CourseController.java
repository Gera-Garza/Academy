package com.accenture.academy.controller;

import com.accenture.academy.model.Course;
import com.accenture.academy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(path = "/course")
    public @ResponseBody
    Course createCourse(@RequestBody Course newCourse){
        return courseService.createCourse(newCourse);
    }

    @GetMapping()
    public @ResponseBody Iterable<Course> getALl(){
        return courseService.getALl();
    }

    @GetMapping(path = "/{language}")
    public @ResponseBody Course getCourseByLanguage(@PathVariable String language) {
        return courseService.findByLanguage(language);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody Course updateCourse(@PathVariable Integer id, @RequestBody Course updateCourse) {
        return courseService.updateCourse(id, updateCourse);
    }
    @DeleteMapping(path = "{id}")
    public @ResponseBody Integer deleteCourse(@PathVariable Integer id) {

        return courseService.deleteCourse(id);
    }
}
