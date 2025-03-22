package parking.ticket.parkingticket.dtos.reponse;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.entity.GateType;
import parking.ticket.parkingticket.entity.ParkingAttendant;
@Getter
@Setter
public class GateEntryResponseDto {
    private long entryGateId;
    private String name;
    private GateType gateType;
    private ParkingAttendantResponseDto parkingAttendant;
}
