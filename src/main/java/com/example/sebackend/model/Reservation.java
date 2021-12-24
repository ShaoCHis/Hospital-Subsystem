package com.example.sebackend.model;/**
 * Created By ShaoCHi
 * Date 2021/12/24 8:43 PM
 * Tongji University
 */

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
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

  private Integer number;

  private Date reserveDate;

  private Date reserveTime;

  private String patientId;

  private String patientName;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "hospital_Id")
  private Hospital hospital;
}
