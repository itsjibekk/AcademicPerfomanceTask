package com.example.academicperfomancetask.mappers.impl;

import com.example.academicperfomancetask.entities.Scholarship;
import com.example.academicperfomancetask.entities.dtos.ScholarshipDto;
import com.example.academicperfomancetask.mappers.ScholarshipMapper;
import com.example.academicperfomancetask.services.StudentService;
import com.example.academicperfomancetask.utils.DateUtil;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class ScholarshipMapperImpl implements ScholarshipMapper {
    private final StudentService studentService;

    public ScholarshipMapperImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Scholarship toScholarship(ScholarshipDto scholarshipDto) {
        Scholarship scholarship = new Scholarship();
        scholarship.setId(scholarshipDto.getId());
        scholarship.setRate(scholarshipDto.getRate());
        scholarship.setStudent(studentService.findStudentByid(scholarshipDto.getStudent_id()));
        scholarship.setEnd_date(DateUtil.getInstance().getEndDate());
        scholarship.setStart_date(new Date());
        return scholarship;
    }
    @Override
    public ScholarshipDto toScholarshipDto(Scholarship scholarship) {
        ScholarshipDto scholarshipDto = new ScholarshipDto();
        scholarshipDto.setEnd_date(scholarship.getEnd_date());
        scholarshipDto.setRate(scholarship.getRate());
        scholarshipDto.setStart_date(scholarship.getStart_date());
        scholarshipDto.setStudent_id(scholarship.getStudent().getId());
        scholarshipDto.setId(scholarship.getId());
        return scholarshipDto;
    }
}
