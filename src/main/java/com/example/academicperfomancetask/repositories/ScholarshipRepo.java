package com.example.academicperfomancetask.repositories;

import com.example.academicperfomancetask.entities.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScholarshipRepo extends JpaRepository<Scholarship,Long> {
}
