package com.example.academicperfomancetask.services.impl;

import com.example.academicperfomancetask.entities.Exam;
import com.example.academicperfomancetask.entities.dtos.ExamDto;
import com.example.academicperfomancetask.mappers.ExamMapper;
import com.example.academicperfomancetask.repositories.ExamRepo;
import com.example.academicperfomancetask.services.ExamService;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamRepo examRepo;
    private final ExamMapper examMapper;

    public ExamServiceImpl(ExamRepo examRepo, ExamMapper examMapper) {
        this.examRepo = examRepo;
        this.examMapper = examMapper;
    }

    @Override
    public ExamDto save(ExamDto examDto) {
        return examMapper.toExamDto(examRepo.save(examMapper.toExam(examDto)));
    }

    @Override
    public ExamDto update(ExamDto examDto) {
        Exam exam= examRepo.findById(examMapper.toExam(examDto).getId()).orElseThrow();
        exam = examRepo.save(examMapper.toExam(examDto));
        return examMapper.toExamDto(exam);
    }
}
