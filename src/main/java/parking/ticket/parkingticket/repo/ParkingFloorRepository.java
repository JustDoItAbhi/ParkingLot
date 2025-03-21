package parking.ticket.parkingticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parking.ticket.parkingticket.entity.ParkingFloor;
@Repository
public interface ParkingFloorRepository extends JpaRepository<ParkingFloor,Long> {
}
