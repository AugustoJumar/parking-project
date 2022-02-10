package com.api.parkingcontrol.services;
import com.api.parkingcontrol.exception.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;
import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingRepository;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ParkingSpotService {
    
    //@Autowired
    //private ParkingRepository parkingRepository; 

    final ParkingRepository parkingRepository;

    public ParkingSpotService(ParkingRepository parkingRepository){
        this.parkingRepository = parkingRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingRepository.save(parkingSpotModel);
    }

    public List <ParkingSpotModel> findAll() {
        return parkingRepository.findAll();
    }

    public Optional<ParkingSpotModel> findById(Long id) {
        return parkingRepository.findById(id);
             
    }

  
    public void  delete(ParkingSpotModel parkingSpotModel) {
        parkingRepository.delete(parkingSpotModel);
    }


}


   /* public boolean existByLicensePlater(String licensePlater) {
        return parkingRepository.existByLicensePlater(licensePlater);
    }

    public boolean existByParkingSpotNumber(String parkingSpotNumber) {
        return parkingRepository.existByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existByApartmentAndBlock(String apartment, String block) {
        return parkingRepository.existByApartmentAndBlock(apartment, block);
    }
*/


