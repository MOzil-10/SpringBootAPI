package com.example.springApi.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity  
@Table(name="customers")


public class Customer {
    
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

      @Column(name="email")
    private String email;

      @Column(name="username")
    private String username;

      @Column(name="password")
    private String password;

      @Column(name="confirmPassword")
    private String confirmPassword;
}
