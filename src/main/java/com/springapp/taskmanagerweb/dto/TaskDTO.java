package com.springapp.taskmanagerweb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.springapp.taskmanagerweb.enums.Category;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskDTO {

    private Long id;

    private String title;

    private String description;

    private Category category;

    private boolean isCompleted;

    private UserDTO user;
}
