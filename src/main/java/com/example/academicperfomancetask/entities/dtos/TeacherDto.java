package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherDto {


    Long id;

    @JsonProperty("name")
    String teacherName;

    @JsonProperty("surname")
    String teacherSurname;

    @JsonProperty("patronymic")
    String teacherPatronymic;

    boolean active;

}
