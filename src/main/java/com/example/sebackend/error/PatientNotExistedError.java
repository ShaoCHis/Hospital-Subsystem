package com.example.sebackend.error;
/**
 * Created By ShaoCHi
 * Date 2021/11/20 5:28 下午
 * Tongji University
 */

/**
 * author ShaoCHi
 * Date 2021/11/20 5:28 下午
 * Tongji University
 */

public class PatientNotExistedError implements ServiceError {
  @Override
  public String getMessage() {
    return "Patient isn't existed!";
  }

  @Override
  public Integer getCode() {return 3;}
}
