package com.example.academicperfomancetask.services;

import com.example.academicperfomancetask.entities.dtos.GetStudentDto;
import com.example.academicperfomancetask.entities.dtos.StudentDto;

public interface StudentService {
    StudentDto save(StudentDto studentDto);

    StudentDto update(StudentDto studentDto);


}
