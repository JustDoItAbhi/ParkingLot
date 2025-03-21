package parking.ticket.parkingticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parking.ticket.parkingticket.entity.ParkingAttendant;
@Repository
public interface ParkingAttendentRepository extends JpaRepository<ParkingAttendant,Long> {
}
