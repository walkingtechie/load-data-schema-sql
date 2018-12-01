package com.walking.techie.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
}
