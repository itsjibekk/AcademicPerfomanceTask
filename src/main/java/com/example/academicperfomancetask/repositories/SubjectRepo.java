package com.example.academicperfomancetask.repositories;

import com.example.academicperfomancetask.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject,Long> {
}
