package com.example.sebackend.repository;

import com.example.sebackend.model.Reservation;
import com.example.sebackend.views.CancelReservation;
import com.example.sebackend.views.Reservations;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By ShaoCHi
 * Date 2021/12/24 9:05 PM
 * Tongji University
 */
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

  default Reservation findByCancel(CancelReservation body) {
    Iterable<Reservation> reservations = findAll();
    for (Reservation reservation : reservations) {
      if (reservation.getHospital().getId() == body.getHospitalId() && reservation.getPatientId() == body.getPatientId() && reservation.getReserveDate() == body.getReserveDate() && reservation.getReserveTime() == body.getReserveTime()) {
        return reservation;
      }
    }
    return null;
  }
}
