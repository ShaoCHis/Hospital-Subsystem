package com.example.sebackend.service;/**
 * Created By ShaoCHi
 * Date 2021/11/18 8:20 下午
 * Tongji University
 */

import com.example.sebackend.error.HospitalNotExistedError;
import com.example.sebackend.model.Hospital;
import com.example.sebackend.repository.HospitalRepository;
import com.example.sebackend.utils.Result;
import com.example.sebackend.views.HospitalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * author ShaoCHi
 * Date 2021/11/18 8:20 下午
 * Tongji University
 */

@Service
public class HospitalService {

  @Autowired
  private HospitalRepository hospitalRepository;

  public Result<HospitalInfo> getHospitalInfo(String id) {
    Optional<Hospital> hospitalOption=hospitalRepository.findById(id);
    if(!hospitalOption.isPresent()){
      return Result.wrapErrorResult(new HospitalNotExistedError());
    }
    return Result.wrapErrorResult(new HospitalNotExistedError());
  }
}
