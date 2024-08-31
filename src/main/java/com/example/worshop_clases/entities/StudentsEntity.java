package com.example.worshop_clases.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "student")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name is required ")
    private String name;

    @NotBlank(message = "LastName is required ")
    private String lastName;

    @NotNull(message = "Age id required")
    @Min(value = 0, message = "Must be greater than zero")
    private Integer age;

    @NotBlank(message = "Email is required")
    @Email(message = "Email is required")
    private String email;

    @NotNull(message = "CreateAt is required ")
    private LocalDateTime createAt;

    @NotNull(message = "Status is required")
    private Boolean active = true;

    @NotNull(message = "Class is required")
    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassEntity classEntity;

    public StudentsEntity(){
        this.createAt = LocalDateTime.now();
    }
}
