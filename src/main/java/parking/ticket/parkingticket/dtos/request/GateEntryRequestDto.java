package parking.ticket.parkingticket.dtos.request;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.entity.ParkingAttendant;

@Getter
@Setter
public class GateEntryRequestDto {
    private String name;
    private String gateType;
    private ParkingAttendantRequestDto parkingAttendant;
}
