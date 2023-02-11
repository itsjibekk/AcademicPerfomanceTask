package com.example.academicperfomancetask.mappers.impl;

import com.example.academicperfomancetask.entities.Teacher;
import com.example.academicperfomancetask.entities.dtos.TeacherDto;
import com.example.academicperfomancetask.mappers.TeacherMapper;
import org.springframework.stereotype.Service;

@Service
public class TeacherMapperImpl implements TeacherMapper {

    public Teacher teacherDtotoTeacher(TeacherDto teacherDto){
        Teacher teacher = new Teacher();
        teacher.setName(teacherDto.getTeacherName());
        teacher.setPatronymic(teacherDto.getTeacherPatronymic());
        teacher.setSurname(teacherDto.getTeacherSurname());
        teacher.setActive(teacherDto.isActive());
        teacher.setId(teacherDto.getId());
        return teacher;
    }

    public TeacherDto teacherToTeacherDto(Teacher teacher){
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherName(teacher.getName());
        teacherDto.setTeacherPatronymic(teacher.getPatronymic());
        teacherDto.setTeacherSurname(teacher.getSurname());
        teacherDto.setActive(teacher.isActive());
        teacherDto.setId(teacher.getId());
        return teacherDto;
    }
}
