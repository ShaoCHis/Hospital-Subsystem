package com.example.sebackend.model;/**
 * Created By ShaoCHi
 * Date 2021/12/24 8:43 PM
 * Tongji University
 */

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * author ShaoCHi
 * Date 2021/12/24 8:43 PM
 * Tongji University
 */
@Entity
@Getter
@Setter
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String departmentName;

  private String doctorName;

  private String number;

  private Date reserveDate;

  private Time reserveTime;

  private String patientId;

  private String patientName;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "hospital_Id")
  private Hospital hospital;
}
