package com.example.academicperfomancetask.entities.dtos;

import jakarta.persistence.GeneratedValue;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubjectDto {
    @GeneratedValue
    Long id;
    String name;
    boolean active;
    Long teacher_id;

}
