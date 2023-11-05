package com.example.OCB.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auth {
    private Long id;
    private String login;
    private String pass;
}