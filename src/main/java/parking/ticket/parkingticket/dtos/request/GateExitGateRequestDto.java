package parking.ticket.parkingticket.dtos.request;

import lombok.Getter;
import lombok.Setter;
import parking.ticket.parkingticket.dtos.reponse.ParkingAttendantResponseDto;
import parking.ticket.parkingticket.entity.ParkingAttendant;

@Getter
@Setter
public class GateExitGateRequestDto {
    private String name;
    private String  exitGate;
    private ParkingAttendantResponseDto parkingAttendant;
}
