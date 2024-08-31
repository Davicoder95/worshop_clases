package com.example.worshop_clases.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lesson")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Boolean active= true;

    @ManyToOne
    @JoinColumn(name = "class-id")
    private ClassEntity classEntity;
}
