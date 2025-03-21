package parking.ticket.parkingticket.dtos.aditiondto;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.entity.GateType;
import parking.ticket.parkingticket.entity.ParkingAttendant;

@Getter
@Setter
public class GateRequestDto {
    private String name;

    private GateType type;

    private ParkingAttendant parkingAttendant;
}
