package parking.ticket.parkingticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parking.ticket.parkingticket.entity.ParkingSpot;
@Repository
public interface ParkingSlotRespository   extends JpaRepository<ParkingSpot,Long> {
}
