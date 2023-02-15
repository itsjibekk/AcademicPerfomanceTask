package com.example.academicperfomancetask.services.impl;

import com.example.academicperfomancetask.entities.Student;
import com.example.academicperfomancetask.entities.dtos.StudentDto;
import com.example.academicperfomancetask.mappers.StudentMapper;
import com.example.academicperfomancetask.repositories.StudentRepo;
import com.example.academicperfomancetask.services.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;
    public StudentServiceImpl(StudentRepo studentRepo, StudentMapper studentMapper) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
    }
    @Override
    public StudentDto save(StudentDto studentDto) {
        return studentMapper.ToStudentDto(studentRepo.save(studentMapper.ToStudent(studentDto)));
    }

    @Override
    public StudentDto update(StudentDto studentDto) {
            Student student = studentRepo.findById(studentMapper.ToStudent(studentDto).getId()).orElseThrow();
            student = studentRepo.save(studentMapper.ToStudent(studentDto));
            return studentMapper.ToStudentDto(student);
        }

    @Override
    public Student findStudentByid(Long id) {
        if (id != null){
            Student student = studentRepo.findById(id).orElseThrow();
            if(studentRepo.findById(id).isPresent()) return student;
        }

        Student student1 = new Student();
        student1.setId(2L);
        student1.setAcitve(true);
        student1.setPatronymic("fe");
        student1.setName("re");
        student1.setSurname("ty");
        return student1;
    }


}

