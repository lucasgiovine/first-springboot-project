package com.lucasfalcone.FirstSpringBootProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasfalcone.FirstSpringBootProject.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUser_Id(Long id); // Query using JpaRepository interface

    // @Query(value = "SELECT t FROM Task t WHERE t.user.id = :id") // Query using JPQL (from Spring)
    // List<Task> findByUser_Id(@Param("id") Long id);

    // @Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)      // Query using SQL
    // List<Task> findByUser_Id(@Param("id") Long id);

}
