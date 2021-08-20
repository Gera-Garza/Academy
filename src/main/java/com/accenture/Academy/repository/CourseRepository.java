package com.accenture.academy.repository;

import com.accenture.academy.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer> {



    @Query(value = "select * from courses where language = :language", nativeQuery = true)
    public Course findByLanguage(@Param("language") String language);


}
