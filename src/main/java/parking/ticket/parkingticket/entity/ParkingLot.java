package parking.ticket.parkingticket.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@Entity
public class ParkingLot extends BaseModel{
    @OneToMany
    private List<ParkingFloor> parkingFloors;
    @OneToMany
    private List<Gate> gates;
    private String name;
    private String address;
}
