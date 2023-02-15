package com.example.academicperfomancetask.services;


import com.example.academicperfomancetask.entities.dtos.ScholarshipDto;

public interface ScholarshipService {

    ScholarshipDto save(ScholarshipDto scholarshipDto);

    ScholarshipDto update(ScholarshipDto scholarshipDto);
}
