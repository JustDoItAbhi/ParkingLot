package parking.ticket.parkingticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
//@Entity
@ToString
@Entity
public class Ticket extends BaseModel{
    @OneToOne
    private Vehicle vehicle;
    private Date entryTime;
    @OneToOne
    private ParkingSpot parkingSpot;
    @OneToOne
    private Gate gate;
    @OneToOne
    private ParkingAttendant parkingAttendant;

}
