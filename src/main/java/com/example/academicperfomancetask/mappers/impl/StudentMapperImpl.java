package com.example.academicperfomancetask.mappers.impl;

import com.example.academicperfomancetask.entities.Student;
import com.example.academicperfomancetask.entities.dtos.StudentDto;
import com.example.academicperfomancetask.mappers.StudentMapper;
import com.example.academicperfomancetask.mappers.SubjectMapper;
import com.example.academicperfomancetask.services.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class StudentMapperImpl implements StudentMapper {

    private final SubjectService subjectService;
    private final SubjectMapper subjectMapper;

    public StudentMapperImpl(SubjectService subjectService, SubjectMapper subjectMapper) {
        this.subjectService = subjectService;
        this.subjectMapper = subjectMapper;
    }

    @Override
    public Student ToStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setSurname(studentDto.getSurname());
        student.setPatronymic(studentDto.getPatronymic());
        student.setAcitve(studentDto.isActive());
        student.setAddress(studentDto.getAddress());
        student.setSubject(subjectMapper.toSubject(subjectService.findSubjectById(studentDto.getSubject_id())));
        student.setId(studentDto.getId());
        return student;
    }
    @Override
    public StudentDto ToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setName(student.getName());
        studentDto.setSurname(student.getSurname());
        studentDto.setPatronymic(student.getPatronymic());
        studentDto.setActive(student.isAcitve());
        studentDto.setAddress(student.getAddress());
        studentDto.setSubject_id(student.getSubject().getId());
        studentDto.setId(student.getId());
        return studentDto;
    }
}
