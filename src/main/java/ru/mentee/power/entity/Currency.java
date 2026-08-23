package ru.mentee.power.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currencies")
public class Currency {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "code")
  private String code;

  @Column(name = "fullname")
  private String fullName;

  @Column(name = "sign")
  private String sign;
}
