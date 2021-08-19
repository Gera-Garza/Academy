package com.accenture.academy.repository;

import com.accenture.academy.model.Enrolled;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EnrolledRepository extends CrudRepository<Enrolled,Integer> {

    @Query("insert into enrolled (id,status,time_dedicated,academic_id,course_id) " +
            "values (:id,:status,:time,:academicId,:courseId);")
    public Enrolled createEnrolled(@Param("id")Integer id,@Param("status") String status,
                                   @Param("time") Integer time,@Param("academicId") Integer academicId,
                                   @Param("courseId") Integer courseId);
    @Query("select * from enrolled where academic_id = :id")
    public Iterable<Enrolled> getALl(@Param("id") Integer id);
}
