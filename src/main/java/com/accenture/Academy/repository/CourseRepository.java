package com.accenture.academy.repository;

import com.accenture.academy.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Integer> {
}
