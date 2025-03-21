package parking.ticket.parkingticket.strategies;

import parking.ticket.parkingticket.entity.ParkingLot;
import parking.ticket.parkingticket.entity.ParkingSpot;
import parking.ticket.parkingticket.entity.VehicleType;

import java.util.Optional;

public interface SpotAssignmentStrategy {
    Optional<ParkingSpot> assignSpot(ParkingLot parkingLot, VehicleType vehicleType);

}
