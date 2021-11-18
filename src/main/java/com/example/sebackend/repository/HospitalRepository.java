package com.example.sebackend.repository;/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:47 下午
 * Tongji University
 */

import com.example.sebackend.model.Hospital;
import org.springframework.data.repository.CrudRepository;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:47 下午
 * Tongji University
 */
public interface HospitalRepository extends CrudRepository<Hospital,String> {
}
