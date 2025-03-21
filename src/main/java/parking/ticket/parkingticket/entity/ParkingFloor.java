package parking.ticket.parkingticket.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@Entity
public class ParkingFloor extends BaseModel{
    @OneToMany
    private List<ParkingSpot> spots;
    @Enumerated(EnumType.STRING)
    private FloorStatus status;

    private int floorNumber;



}

