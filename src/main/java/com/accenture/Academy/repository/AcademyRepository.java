package com.accenture.academy.repository;

import com.accenture.academy.model.Academic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AcademyRepository extends CrudRepository<Academic,Integer> {


}
