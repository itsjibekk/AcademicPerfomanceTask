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
        Teacher teacherById = teacherMapper.teacherDtotoTeacher(findTeacherById(teacherDto.getId()));
        if(teacherById == null) {
            return null;
        }
        Teacher teacher = teacherMapper.teacherDtotoTeacher(teacherDto);
        teacher = teacherRepo.save(teacher);
        return teacherMapper.teacherToTeacherDto(teacher);
    }
    @Override
    public TeacherDto findTeacherById(Long id) {
        if (id != null){
            Teacher teacher = teacherRepo.findById(id).orElseThrow();
            if(teacherRepo.findById(id).isPresent()) return teacherMapper.teacherToTeacherDto(teacher);
        }

        Teacher teacher1 = new Teacher();
        teacher1.setId(1L);
        teacher1.setActive(true);
        teacher1.setPatronymic("fe");
        teacher1.setName("re");
        teacher1.setSurname("ty");
         return teacherMapper.teacherToTeacherDto(teacher1);
    }
}
