package com.prac.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userId;
    public String password;
}
