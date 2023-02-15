package com.example.academicperfomancetask.mappers.impl;

import com.example.academicperfomancetask.entities.Subject;
import com.example.academicperfomancetask.entities.dtos.SubjectDto;
import com.example.academicperfomancetask.mappers.SubjectMapper;
import com.example.academicperfomancetask.mappers.TeacherMapper;
import com.example.academicperfomancetask.repositories.TeacherRepo;
import com.example.academicperfomancetask.services.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectMapperImpl implements SubjectMapper {
    private final TeacherRepo teacherRepo;
    private final TeacherService teacherService;
    private final TeacherMapper teacherMapper;

    public SubjectMapperImpl(TeacherRepo teacherRepo, TeacherService teacherService, TeacherMapper teacherMapper) {
        this.teacherRepo = teacherRepo;
        this.teacherService = teacherService;
        this.teacherMapper = teacherMapper;

    }
    @Override
    public SubjectDto subjectToDto(Subject subject) {
        SubjectDto subjectDto = new SubjectDto();
        subjectDto.setActive(subject.isActive());
        subjectDto.setName(subject.getName());
        subjectDto.setId(subject.getTeacher().getId());
        subjectDto.setSubject_id(subject.getId());
        return subjectDto;
    }
    @Override
    public Subject toSubject(SubjectDto subjectDto) {
       Subject subject = new Subject();
       subject.setActive(subjectDto.isActive());
       List<Long> list =  teacherRepo.findIdByActive(true);
           //если есть активные учителя с такими предметами то сабжект актив
        //find by id in teacher if he is active
       if (list.contains(subjectDto.getId())) subject.setActive(true);
       subject.setName(subjectDto.getName());
       subject.setTeacher(teacherMapper.teacherDtotoTeacher(teacherService.findTeacherById(subjectDto.getId())));
       subject.setId(subjectDto.getSubject_id());
       return subject;
    }
}
