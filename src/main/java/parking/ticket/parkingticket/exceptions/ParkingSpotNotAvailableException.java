package parking.ticket.parkingticket.exceptions;

public class ParkingSpotNotAvailableException extends RuntimeException{
    public ParkingSpotNotAvailableException(String message) {
        super(message);
    }
}
