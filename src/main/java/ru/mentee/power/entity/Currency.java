package ru.mentee.power.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "currencies")
public class Currency {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true, length = 3)
  private String code;

  @Column(name = "full_name", nullable = false)
  private String fullName;

  @Column(nullable = false, length = 10)
  private String sign;

  public Currency(String code, String fullName, String sign) {
    this.code = code;
    this.fullName = fullName;
    this.sign = sign;
  }
}
