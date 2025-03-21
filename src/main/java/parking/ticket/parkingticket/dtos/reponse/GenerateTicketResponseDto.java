package parking.ticket.parkingticket.dtos.reponse;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseStatus;
import parking.ticket.parkingticket.entity.Ticket;
@Getter
@Setter
public class GenerateTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}
