package com.example.academicperfomancetask.services;

import com.example.academicperfomancetask.entities.dtos.TeacherDto;

public interface TeacherService {
    TeacherDto save(TeacherDto teacherDto);

    TeacherDto update(TeacherDto teacherDto);

    TeacherDto findTeacherById(Long id);

}
