package com.example.academicperfomancetask.services;

import com.example.academicperfomancetask.entities.dtos.ExamDto;

public interface ExamService {
    ExamDto save(ExamDto examDto);

    ExamDto update(ExamDto examDto);
}
