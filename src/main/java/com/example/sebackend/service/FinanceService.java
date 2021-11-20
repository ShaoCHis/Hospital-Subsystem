package com.example.sebackend.service;/**
 * Created By ShaoCHi
 * Date 2021/11/19 10:58 上午
 * Tongji University
 */

import com.example.sebackend.error.HospitalNotExistedError;
import com.example.sebackend.model.Finance;
import com.example.sebackend.repository.FinanceRepository;
import com.example.sebackend.repository.HospitalRepository;
import com.example.sebackend.request.Economy;
import com.example.sebackend.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * author ShaoCHi
 * Date 2021/11/19 10:58 上午
 * Tongji University
 */

@Service
public class FinanceService {
  @Autowired
  private FinanceRepository financeRepository;

  @Autowired
  private HospitalRepository hospitalRepository;

  public Result<String> updateEconomy(Economy body) {
    Optional<Finance> financeOptional=financeRepository.findById(body.getHospitalId());
    if(!financeOptional.isPresent()||hospitalRepository.findById(body.getHospitalId()).get().getStatus()==0)
      return Result.wrapErrorResult(new HospitalNotExistedError());
    financeOptional.get().setEconomy(financeOptional.get().getEconomy()+body.getEconomy());
    financeRepository.save(financeOptional.get());
    return Result.wrapSuccessfulResult("update Success!");
  }
}
