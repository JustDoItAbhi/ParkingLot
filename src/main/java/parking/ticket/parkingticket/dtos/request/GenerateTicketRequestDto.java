package parking.ticket.parkingticket.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketRequestDto {
    private int gateId;
    private String registrationNumber;
    private String vehicleType;
}
