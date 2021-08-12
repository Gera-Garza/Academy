package com.accenture.academy.repository;

import com.accenture.academy.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer> {


    public Course findById(int id);

    public Course findByLanguage(String language);

    @Query("Select * from course c where c.language = language")
    public Course findByEmailAccount(@Param("langauge") String langauge);


}
