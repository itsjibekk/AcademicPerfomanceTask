package com.example.academicperfomancetask.repositories;

import com.example.academicperfomancetask.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {

    Optional<Teacher> findById(Long Id);
}
