package com.example.sebackend.views;/**
 * Created By ShaoCHi
 * Date 2021/12/24 9:14 PM
 * Tongji University
 */

import lombok.Data;

import java.util.Date;

/**
 * author ShaoCHi
 * Date 2021/12/24 9:14 PM
 * Tongji University
 */
@Data
public class CancelReservation {
  private String patientId;

  private String hospitalId;

  private Date reserveDate;

  private Date reserveTime;
}
