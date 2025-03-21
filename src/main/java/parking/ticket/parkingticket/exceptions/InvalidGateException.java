package parking.ticket.parkingticket.exceptions;

public class InvalidGateException extends RuntimeException{
    public InvalidGateException(String message) {
        super(message);
    }
}
