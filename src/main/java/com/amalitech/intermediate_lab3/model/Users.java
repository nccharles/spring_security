package com.amalitech.intermediate_lab3.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

}

