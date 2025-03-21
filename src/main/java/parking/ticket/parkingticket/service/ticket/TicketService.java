package parking.ticket.parkingticket.service.ticket;

import parking.ticket.parkingticket.entity.Ticket;
import parking.ticket.parkingticket.exceptions.InvalidGateException;
import parking.ticket.parkingticket.exceptions.InvalidParkingLotException;
import parking.ticket.parkingticket.exceptions.ParkingSpotNotAvailableException;

public interface TicketService {
    // Do not modify the method signatures, feel free to add new methods
    public Ticket generateTicket(int gateId, String registrationNumber, String vehicleType) throws InvalidGateException, InvalidParkingLotException, ParkingSpotNotAvailableException;
}

