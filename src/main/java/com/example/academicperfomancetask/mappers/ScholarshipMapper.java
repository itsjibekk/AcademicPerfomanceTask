package com.example.academicperfomancetask.mappers;

import com.example.academicperfomancetask.entities.Scholarship;
import com.example.academicperfomancetask.entities.dtos.ScholarshipDto;

public interface ScholarshipMapper {

    Scholarship toScholarship(ScholarshipDto scholarshipDto);
    ScholarshipDto toScholarshipDto(Scholarship scholarship);
}
