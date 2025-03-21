package parking.ticket.parkingticket.dtos.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLotRequestDto {
    private long id;
    private String name;
    private String address;
    private List<ParkingFloorRequestDto> parkingFloors;
    private List<ParkingSpotRequestDto>parkingSpots;
    private List<GateEntryRequestDto> entryGate;
    private List<GateExitGateRequestDto> exitGate;

}
