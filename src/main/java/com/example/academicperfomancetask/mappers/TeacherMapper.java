package com.example.academicperfomancetask.mappers;

import com.example.academicperfomancetask.entities.Teacher;
import com.example.academicperfomancetask.entities.dtos.TeacherDto;

public interface TeacherMapper {

     Teacher teacherDtotoTeacher(TeacherDto teacherDto);

    TeacherDto teacherToTeacherDto(Teacher teacher);
}
