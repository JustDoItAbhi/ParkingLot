package parking.ticket.parkingticket.dtos.reponse;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.dtos.ResponseStatus;

import java.util.List;

@Getter
@Setter
public class ParkingLotResponseDto {
    private long id;
    private String name;
    private String address;
    private List<ParkingFloorResponseDto> parkingFloors;
    private List<ParkingSpotResponseDto>parkingSpots;
    private List<GateEntryResponseDto> entryGate;
    private List<GateExitGateResponseDto> exitGate;
    private ResponseStatus status;
}
