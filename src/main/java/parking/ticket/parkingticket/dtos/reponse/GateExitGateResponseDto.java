package parking.ticket.parkingticket.dtos.reponse;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.entity.Gate;
import parking.ticket.parkingticket.entity.GateType;
import parking.ticket.parkingticket.entity.ParkingAttendant;
@Getter
@Setter
public class GateExitGateResponseDto {
    private long exitGateId;
    private String name;
    private GateType exitGate;
    private ParkingAttendantResponseDto parkingAttendant;
}
