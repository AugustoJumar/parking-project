package com.api.parkingcontrol.repositories;


import com.api.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingSpotModel, Long> {

    /*
    boolean existByLicensePlater(String licensePlater);
    
    boolean existByParkingSpotNumber(String parkingSpotNumber);

    boolean existByApartmentAndBlock(String apartment, String block);
    */
}
