package com.example.academicperfomancetask.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher {
    @Id
    Long id;
    @JsonProperty("name")
    String teacherName;

    @JsonProperty("surname")
    String teacherSurname;

    @JsonProperty("Patronymic")
    String teacherPatronymic;

    boolean active;

}
