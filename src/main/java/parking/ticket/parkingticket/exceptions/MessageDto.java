package parking.ticket.parkingticket.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDto {
private String message;
private int code;

    public MessageDto(String message, int code) {
        this.message = message;
        this.code = code;
    }
}
