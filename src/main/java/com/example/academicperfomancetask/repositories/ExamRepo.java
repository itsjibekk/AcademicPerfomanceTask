package com.example.academicperfomancetask.repositories;

import com.example.academicperfomancetask.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepo extends JpaRepository<Exam,Long> {

}
