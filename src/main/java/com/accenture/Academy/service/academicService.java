package com.accenture.academy.service;

import com.accenture.academy.model.Academic;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


public interface AcademicService {

    public Academic createAcademic(Academic newAcademic);
    public Iterable<Academic> getALl();
    public  Academic getAcademic(Integer id);
    public Academic updateAcademic( Integer id, Academic updateAcademic);
    public Integer deleteAcademic( Integer id);
}
