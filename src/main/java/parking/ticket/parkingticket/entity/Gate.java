package parking.ticket.parkingticket.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Gate extends BaseModel{

    private String name;
    @Enumerated(EnumType.STRING)
    private GateType type;
    @OneToOne
    private ParkingAttendant parkingAttendant;

    @Override
    public String toString() {
        return "Gate{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", parkingAttendant=" + parkingAttendant +
                '}';
    }
}

