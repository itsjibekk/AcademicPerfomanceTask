package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetSubjectDto {
    @JsonProperty("name")
    String name;
    @JsonProperty("teacher_name")
    String teacher_name;
    Long teacherId;
    @JsonProperty("exams")
    List<GetExamDto> exams;
    @GeneratedValue
    Long subjectId;
    boolean active;
}
