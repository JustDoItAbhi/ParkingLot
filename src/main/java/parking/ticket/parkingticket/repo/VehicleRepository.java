package parking.ticket.parkingticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parking.ticket.parkingticket.entity.Vehicle;

import java.util.Optional;
@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle,Long> {
    public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber);

    public Vehicle save(Vehicle vehicle);
}
