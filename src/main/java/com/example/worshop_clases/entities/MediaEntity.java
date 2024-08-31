package com.example.worshop_clases.entities;


import com.example.worshop_clases.enums.TypeMultiMedia;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "media")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MediaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "type is required")
    private TypeMultiMedia type;

    @NotNull(message = "id required")
    @OneToOne
    @JoinColumn(name = "id_lesson")
    private LessonEntity lessonEntity;
}
