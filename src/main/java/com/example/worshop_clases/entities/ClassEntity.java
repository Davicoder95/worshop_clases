package com.example.worshop_clases.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "class")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Boolean active = true;

}
