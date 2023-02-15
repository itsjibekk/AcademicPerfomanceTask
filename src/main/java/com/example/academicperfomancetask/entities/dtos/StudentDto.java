package com.example.academicperfomancetask.entities.dtos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDto {

    Long id;
    String name;
    String surname;
    String patronymic;
    String address;
    boolean active;
    Long subject_id;
}
