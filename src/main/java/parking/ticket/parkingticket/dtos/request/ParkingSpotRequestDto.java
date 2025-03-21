package parking.ticket.parkingticket.dtos.request;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.entity.ParkingSpotStatus;

@Getter
@Setter
public class ParkingSpotRequestDto {
    private int number;
    private String supportedVehicleType;
    private String status;
}
