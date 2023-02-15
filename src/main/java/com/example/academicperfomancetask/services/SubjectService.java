package com.example.academicperfomancetask.services;

import com.example.academicperfomancetask.entities.dtos.SubjectDto;

public interface SubjectService {

    SubjectDto save(SubjectDto subjectDto);

    SubjectDto update(SubjectDto subjectDto);
}
