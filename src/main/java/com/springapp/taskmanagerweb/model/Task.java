package com.springapp.taskmanagerweb.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.springapp.taskmanagerweb.enums.Category;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    private boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "users_id")
    @JsonBackReference(value = "users-tasks") // prevents circular dependency leading to stack overflow
    private User user;
}
