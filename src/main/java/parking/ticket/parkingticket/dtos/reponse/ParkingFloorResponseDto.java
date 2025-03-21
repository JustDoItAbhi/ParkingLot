package parking.ticket.parkingticket.dtos.reponse;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.entity.FloorStatus;

import java.util.List;
@Getter
@Setter
public class ParkingFloorResponseDto {
    private long id;
    private List<ParkingSpotResponseDto> spots;
    private FloorStatus status;
    private int floorNumber;

}
