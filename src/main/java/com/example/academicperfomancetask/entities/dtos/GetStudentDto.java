package com.example.academicperfomancetask.entities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetStudentDto {
     Long studentId;
     @JsonProperty("name")
     String name;
     @JsonProperty("surname")
     String surname;
     @JsonProperty("patronymic")
     String patronymic;
     @JsonProperty("scholarship")
     double scholarship;
     @JsonProperty("scholarship_id")
     Long scholarshipId;
     @JsonProperty("subject")
     GetSubjectDto subject;
     boolean active;


}
