package com.accenture.academy.repository;

import com.accenture.academy.model.Enrolled;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EnrolledRepository extends CrudRepository<Enrolled,Integer> {

    @Transactional
    @Modifying
    @Query(value = "insert into enrolled (id,status,time_dedicated,academic_id,course_id) values (:id,:status,:time,:academicId,:courseId)",nativeQuery = true)
    public void createEnrolled(@Param("id")Integer id,@Param("status") String status,
                                   @Param("time") Integer time,@Param("academicId") Integer academicId,
                                   @Param("courseId") Integer courseId);
    @Query(value = "select * from enrolled where academic_id = :id", nativeQuery = true)
    public List<Enrolled> getALl(@Param("id") Integer id);
}
