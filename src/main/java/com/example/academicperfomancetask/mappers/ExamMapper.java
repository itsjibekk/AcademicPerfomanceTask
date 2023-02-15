package com.example.academicperfomancetask.mappers;

import com.example.academicperfomancetask.entities.Exam;
import com.example.academicperfomancetask.entities.dtos.ExamDto;

public interface ExamMapper {
    Exam toExam(ExamDto examDto);
    ExamDto toExamDto(Exam exam);
}
