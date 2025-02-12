package com.crud.H2DataLearning.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "\"user\"")  // Escape the table name with double quotes
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
