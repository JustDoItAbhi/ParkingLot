package parking.ticket.parkingticket.mapper;

import parking.ticket.parkingticket.dtos.ResponseStatus;
import parking.ticket.parkingticket.dtos.reponse.*;
import parking.ticket.parkingticket.entity.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotMapper {
    public static ParkingLotResponseDto fromEntity(ParkingLot lot){
        ParkingLotResponseDto responseDto=new ParkingLotResponseDto();
        responseDto.setId(lot.getId());
        responseDto.setName(lot.getName());
        responseDto.setAddress(lot.getAddress());
    //floor
        List<ParkingFloorResponseDto>floorResponseDtoList=new ArrayList<>();
        for(ParkingFloor floor: lot.getParkingFloors()){
            ParkingFloorResponseDto floorResponseDto=new ParkingFloorResponseDto();
            floorResponseDto.setId(floor.getId());
            floorResponseDto.setFloorNumber(floor.getFloorNumber());
            floorResponseDto.setStatus(floor.getStatus());
            // spot
            List<ParkingSpotResponseDto>spotResponseDtoList=new ArrayList<>();
            for(ParkingSpot spot:floor.getSpots()){
                ParkingSpotResponseDto spotResponseDto=new ParkingSpotResponseDto();
                spotResponseDto.setId(spot.getId());
                spotResponseDto.setStatus(spot.getStatus());
                spotResponseDto.setNumber(spot.getNumber());
                spotResponseDto.setStatus(spot.getStatus());
                spotResponseDto.setSupportedVehicleType(spot.getSupportedVehicleType());
                spotResponseDtoList.add(spotResponseDto);
            }
            floorResponseDtoList.add(floorResponseDto);
            floorResponseDto.setSpots(spotResponseDtoList);
        }
        responseDto.setParkingFloors(floorResponseDtoList);

        List<GateEntryResponseDto>entryGateResponseDto=new ArrayList<>();
        for(Gate entrygate:lot.getGates()) {
            GateEntryResponseDto entryResponseDto = new GateEntryResponseDto();
            entryResponseDto.setId(entrygate.getId());
            entryResponseDto.setName(entrygate.getName());
            entryResponseDto.setGateType(entrygate.getType());
            ParkingAttendantResponseDto attendantResponseDto=new ParkingAttendantResponseDto();
            attendantResponseDto.setId(entrygate.getParkingAttendant().getId());
            attendantResponseDto.setName(entrygate.getParkingAttendant().getName());
            attendantResponseDto.setEmail(entrygate.getParkingAttendant().getEmail());
            entryResponseDto.setParkingAttendant(attendantResponseDto);
            entryGateResponseDto.add(entryResponseDto);
        }
        List<GateExitGateResponseDto>exitGateResponseDtoList=new ArrayList<>();
        for(Gate exit:lot.getGates()){
            GateExitGateResponseDto exitGate=new GateExitGateResponseDto();
            exitGate.setId(exit.getId());
            exitGate.setName(lot.getName());
            exitGate.setExitGate(exit.getType());
            ParkingAttendantResponseDto responseDto1=new ParkingAttendantResponseDto();
            responseDto1.setId(exit.getParkingAttendant().getId());
            responseDto1.setName(exit.getParkingAttendant().getName());
            responseDto1.setEmail(exit.getParkingAttendant().getEmail());
            exitGate.setParkingAttendant(responseDto1);
            exitGateResponseDtoList.add(exitGate);

        }
        responseDto.setEntryGate(entryGateResponseDto);
        responseDto.setExitGate(exitGateResponseDtoList);
        responseDto.setStatus(ResponseStatus.SUCCESS);
        return responseDto;
    }
}
