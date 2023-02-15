package com.example.academicperfomancetask.mappers.impl;

import com.example.academicperfomancetask.entities.Exam;
import com.example.academicperfomancetask.entities.dtos.ExamDto;
import com.example.academicperfomancetask.mappers.ExamMapper;
import com.example.academicperfomancetask.mappers.SubjectMapper;
import com.example.academicperfomancetask.services.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class ExamMapperImpl implements ExamMapper {
    private final SubjectService subjectService;
    private final SubjectMapper subjectMapper;
    public ExamMapperImpl(SubjectService subjectService, SubjectMapper subjectMapper) {
        this.subjectService = subjectService;
        this.subjectMapper = subjectMapper;
    }
    @Override
    public Exam toExam(ExamDto examDto) {
        Exam exam = new Exam();
        exam.setId(examDto.getId());
        exam.setDuration(examDto.getDuration());
        exam.setDate(examDto.getExam_date());
        exam.setSubject(subjectMapper.toSubject(subjectService.findSubjectById(examDto.getSubject_id())));
        return exam;
    }
    @Override
    public ExamDto toExamDto(Exam exam) {
        ExamDto examDto = new ExamDto();
        examDto.setDuration(exam.getDuration());
        examDto.setExam_date(exam.getDate());
        examDto.setSubject_id(exam.getSubject().getId());
        examDto.setId(exam.getId());
        return examDto;
    }
}
