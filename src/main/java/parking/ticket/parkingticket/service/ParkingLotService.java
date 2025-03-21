package parking.ticket.parkingticket.service;

import parking.ticket.parkingticket.dtos.reponse.ParkingLotResponseDto;
import parking.ticket.parkingticket.dtos.request.ParkingLotRequestDto;
import parking.ticket.parkingticket.entity.ParkingLot;

import java.util.HashMap;

public interface ParkingLotService {
    ParkingLotResponseDto create(ParkingLotRequestDto dto);
    ParkingLotResponseDto findById(long id);
    HashMap<Long, ParkingLot>findAll();
}
