package com.example.apiupaobook.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name="reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id", nullable = false)
    private Long id;
    @Column(name="title", nullable = false)
    private String title;
    @Column(name="comment", nullable = false)
    private  String comment;
    @Column(name="rating", nullable = false)
    private  Integer rating;
    @Column(name="createdAt", nullable = false)
    private LocalDateTime createdAt;
    @Column(name="updatedAt", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToMany
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

}
