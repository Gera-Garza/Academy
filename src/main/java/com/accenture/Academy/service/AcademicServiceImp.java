package com.accenture.academy.service;

import com.accenture.academy.model.Academic;
import com.accenture.academy.repository.AcademyRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AcademicServiceImp implements AcademicService{

    @Autowired
    private AcademyRepository academyRepository;

    @Override
    public Academic createAcademic(Academic newAcademic){
        return academyRepository.save(newAcademic);
    }

    @Override
    public Iterable<Academic> getALl() {
        return academyRepository.findAll();
    }

    @Override
    public Academic getAcademic(Integer id) {
        return academyRepository.findById(id).get();
    }

    @Override
    public Academic updateAcademic(Integer id, Academic updateAcademic) {
        Academic academic = academyRepository.findById(id).get();

        academic.setfName(updateAcademic.getfName());
        academic.setlName(updateAcademic.getlName());

        return academyRepository.save(academic);
    }

    @Override
    public Integer deleteAcademic(Integer id) {
        Academic academic = academyRepository.findById(id).get();
        academyRepository.delete(academic);
        return academic.getId();
    }
}

