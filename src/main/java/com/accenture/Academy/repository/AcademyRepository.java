package com.accenture.academy.repository;

import com.accenture.academy.model.Academic;
import org.springframework.data.repository.CrudRepository;

public interface AcademyRepository extends CrudRepository<Academic,Integer> {
}
