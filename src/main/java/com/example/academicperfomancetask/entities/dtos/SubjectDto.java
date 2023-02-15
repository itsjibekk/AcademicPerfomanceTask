package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubjectDto {

    @JsonProperty("id")
    Long subject_id;
    String name;
    boolean active;
    @JsonProperty("teacher_id")
    Long id;

}
