package com.accenture.academy.controller;

import com.accenture.academy.model.Academic;
import com.accenture.academy.model.Enrolled;
import com.accenture.academy.repository.EnrolledRepository;
import com.accenture.academy.service.AcademicService;
import com.accenture.academy.service.EnrolledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/academic")
public class AcademicController {

    @Autowired
    private AcademicService academicService;

    @Autowired
    private EnrolledService enrolledService;


    @PostMapping()
    public @ResponseBody Academic createAcademic(@RequestBody Academic newAcademic){
        return academicService.createAcademic(newAcademic);
    }

    @GetMapping()
    public @ResponseBody Iterable<Academic> getALl(){
        return academicService.getALl();
    }

    @GetMapping(path = "{id}")
    public @ResponseBody Academic getAcademic(@PathVariable Integer id) {
        return academicService.getAcademic(id);
    }

    @PutMapping(path = "{id}")
    public @ResponseBody Academic updateAcademic(@PathVariable Integer id, @RequestBody Academic updateAcademic) {
        return academicService.updateAcademic(id,updateAcademic);
    }
    @DeleteMapping(path = "{id}")
    public @ResponseBody Integer deleteAcademic(@PathVariable Integer id) {
        return academicService.deleteAcademic(id);
    }

   //enrolled

    //post create
    @PostMapping(path = "{academicId}/Course/{courseId}")
     public @ResponseBody Enrolled createEnrolled(@RequestBody Enrolled newEnrolled){
        return enrolledService.createEnrolled(newEnrolled);
    }

    //get all courses from given academic
    @GetMapping(path = "{academicId}/Course")
    public @ResponseBody Enrolled getAll(@PathVariable Integer id){
        return (Enrolled) enrolledService.getAll(id);
    }

    //put update an enrolled
    @PutMapping(path = "/{academicId}/courses/{courseId}")
    public @ResponseBody Enrolled updateEnrolled(@PathVariable Integer academicId,@PathVariable Integer courseId,@ResponseBody Enrolled newEnrolled){
        return enrolledService.updateEnrolled(academicId,courseId,newEnrolled);
    }

}
