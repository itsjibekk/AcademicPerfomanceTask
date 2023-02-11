package com.example.academicperfomancetask.services.impl;

import com.example.academicperfomancetask.entities.Teacher;
import com.example.academicperfomancetask.entities.dtos.TeacherDto;
import com.example.academicperfomancetask.mappers.TeacherMapper;
import com.example.academicperfomancetask.repositories.TeacherRepo;
import com.example.academicperfomancetask.services.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private  final TeacherMapper teacherMapper;

    private final TeacherRepo teacherRepo;
    public TeacherServiceImpl(TeacherMapper teacherMapper, TeacherRepo teacherRepo) {
        this.teacherMapper = teacherMapper;
        this.teacherRepo = teacherRepo;
    }

    @Override
    public TeacherDto save(TeacherDto teacherDto) {

        return teacherMapper.teacherToTeacherDto( teacherRepo.save(teacherMapper.teacherDtotoTeacher(teacherDto)));
    }

    @Override
    public TeacherDto update(TeacherDto teacherDto) {

        Teacher teacher = teacherRepo.findById(teacherDto.getId()).orElseThrow();
        teacher = teacherMapper.teacherDtotoTeacher(teacherDto);
        teacherRepo.save(teacher);
        return teacherMapper.teacherToTeacherDto(teacher);
    }
}
