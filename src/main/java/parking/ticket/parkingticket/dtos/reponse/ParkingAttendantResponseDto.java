package parking.ticket.parkingticket.dtos.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingAttendantResponseDto {
    private long attandentId;
    private String name;
    private String email;
}
