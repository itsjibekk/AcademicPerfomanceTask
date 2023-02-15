package com.example.academicperfomancetask.services.impl;

import com.example.academicperfomancetask.entities.Scholarship;
import com.example.academicperfomancetask.entities.dtos.ScholarshipDto;
import com.example.academicperfomancetask.mappers.ScholarshipMapper;
import com.example.academicperfomancetask.repositories.ScholarshipRepo;
import com.example.academicperfomancetask.services.ScholarshipService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ScholarshipServiceImpl implements ScholarshipService {
    private final ScholarshipRepo scholarshipRepo;
    private final ScholarshipMapper scholarshipMapper;

    public ScholarshipServiceImpl(ScholarshipRepo scholarshipRepo, ScholarshipMapper scholarshipMapper) {
        this.scholarshipRepo = scholarshipRepo;
        this.scholarshipMapper = scholarshipMapper;
    }

    @Override
    public ScholarshipDto save(ScholarshipDto scholarshipDto) {
        return scholarshipMapper.toScholarshipDto(scholarshipRepo.save(scholarshipMapper.toScholarship(scholarshipDto)));
    }

    @Override
    public ScholarshipDto update(ScholarshipDto scholarshipDto) {
        Scholarship scholarship = scholarshipRepo.findById(scholarshipMapper.toScholarship(scholarshipDto).getId()).orElseThrow();
        scholarship.setEnd_date(scholarship.getStart_date());
        scholarship.setStart_date(new Date());
        scholarship = scholarshipRepo.save(scholarshipMapper.toScholarship(scholarshipDto));
        return scholarshipMapper.toScholarshipDto(scholarship);

    }
}
