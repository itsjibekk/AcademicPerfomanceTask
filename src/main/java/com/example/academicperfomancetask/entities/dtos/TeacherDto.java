package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherDto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @JsonProperty("name")
    String teacherName;

    @JsonProperty("surname")
    String teacherSurname;

    @JsonProperty("patronymic")
    String teacherPatronymic;

    boolean active;

}
