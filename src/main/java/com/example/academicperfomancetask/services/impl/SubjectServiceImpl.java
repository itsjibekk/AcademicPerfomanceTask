package com.example.academicperfomancetask.services.impl;

import com.example.academicperfomancetask.entities.Subject;
import com.example.academicperfomancetask.entities.dtos.SubjectDto;
import com.example.academicperfomancetask.mappers.SubjectMapper;
import com.example.academicperfomancetask.repositories.SubjectRepo;
import com.example.academicperfomancetask.services.SubjectService;
import org.springframework.stereotype.Service;
@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepo subjectRepo;
    private final SubjectMapper subjectMapper;

    public SubjectServiceImpl(SubjectRepo subjectRepo, SubjectMapper subjectMapper) {
        this.subjectRepo = subjectRepo;
        this.subjectMapper = subjectMapper;

    }
    @Override
    public SubjectDto save(SubjectDto subjectDto) {
        return subjectMapper.subjectToDto(subjectRepo.save(subjectMapper.toSubject(subjectDto)));
    }
    @Override
    public SubjectDto update(SubjectDto subjectDto) {
        Subject subject = subjectRepo.findById(subjectMapper.toSubject(subjectDto).getId()).orElseThrow();
        subject = subjectRepo.save(subjectMapper.toSubject(subjectDto));
        return subjectMapper.subjectToDto(subject);
    }
}
