package com.example.academicperfomancetask.mappers;

import com.example.academicperfomancetask.entities.Student;
import com.example.academicperfomancetask.entities.dtos.StudentDto;

public interface StudentMapper {

    Student ToStudent(StudentDto studentDto);
    StudentDto ToStudentDto(Student student);
}
