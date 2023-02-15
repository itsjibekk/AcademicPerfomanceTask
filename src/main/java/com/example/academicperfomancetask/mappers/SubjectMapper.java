package com.example.academicperfomancetask.mappers;

import com.example.academicperfomancetask.entities.Subject;
import com.example.academicperfomancetask.entities.dtos.SubjectDto;

public interface SubjectMapper {

      SubjectDto subjectToDto(Subject subject);
      Subject toSubject(SubjectDto subjectDto);
}
