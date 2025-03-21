package parking.ticket.parkingticket.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ParkingAttendant extends BaseModel{
    private String name;
    private String email;
}