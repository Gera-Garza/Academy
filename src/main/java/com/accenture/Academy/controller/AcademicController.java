package com.accenture.academy.controller;

import com.accenture.academy.model.Academic;
import com.accenture.academy.repository.AcademyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/academic")
public class AcademicController {

    @Autowired
    private AcademyRepository academyRepository;

    @PostMapping()
    public @ResponseBody Academic createAcademic(@RequestBody Academic newAcademic){
        return academyRepository.save(newAcademic);
    }

    @GetMapping()
    public @ResponseBody Iterable<Academic> getALl(){
        return academyRepository.findAll();
    }

    @GetMapping(path = "{id}")
    public @ResponseBody Academic getAcademic(@PathVariable Integer id) {
        return academyRepository.findById(id).get();
    }

    @PutMapping(path = "{id}")
    public @ResponseBody Academic updateAcademic(@PathVariable Integer id, @RequestBody Academic updateAcademic) {
        Academic academic = academyRepository.findById(id).get();

        academic.setfName(updateAcademic.getfName());
        academic.setlName(updateAcademic.getlName());

        return academyRepository.save(academic);
    }
    @DeleteMapping(path = "{id}")
    public @ResponseBody Integer deleteAcademic(@PathVariable Integer id) {
        Academic academic = academyRepository.findById(id).get();
        academyRepository.delete(academic);
        return academic.getId();
    }
}
