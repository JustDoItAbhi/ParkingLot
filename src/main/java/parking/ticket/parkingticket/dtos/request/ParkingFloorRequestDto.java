package parking.ticket.parkingticket.dtos.request;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.dtos.reponse.ParkingSpotResponseDto;

import java.util.List;

@Getter
@Setter
public class ParkingFloorRequestDto {
    private List<ParkingSpotRequestDto> spots;
    private String status;
    private int floorNumber;
}
