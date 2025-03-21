package parking.ticket.parkingticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Vehicle extends BaseModel{

    private String registrationNumber;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;


}