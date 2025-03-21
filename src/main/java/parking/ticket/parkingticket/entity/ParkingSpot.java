package parking.ticket.parkingticket.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class ParkingSpot extends BaseModel{

    private int number;
    @Enumerated(EnumType.STRING)
    private List<VehicleType> supportedVehicleType;
    @Enumerated(EnumType.STRING)
    private ParkingSpotStatus status;

}
