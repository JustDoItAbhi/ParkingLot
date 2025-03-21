package parking.ticket.parkingticket.dtos.reponse;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.entity.ParkingSpotStatus;
import parking.ticket.parkingticket.entity.VehicleType;

import java.util.List;

@Getter
@Setter
public class ParkingSpotResponseDto {
    private long id;
    private int number;
    private List<VehicleType> supportedVehicleType;
    private ParkingSpotStatus status;
}
