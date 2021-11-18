package com.example.sebackend.repository;/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:46 下午
 * Tongji University
 */

import com.example.sebackend.model.Doctor;
import org.springframework.data.repository.CrudRepository;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:46 下午
 * Tongji University
 */
public interface DoctorRepository extends CrudRepository<Doctor,String> {
}
