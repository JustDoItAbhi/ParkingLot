package parking.ticket.parkingticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parking.ticket.parkingticket.entity.ParkingLot;

import java.util.Optional;
@Repository
public interface ParkingLotRepository  extends JpaRepository<ParkingLot,Long> {

    public Optional<ParkingLot> getParkingLotByGatesId(long gateId);

    public Optional<ParkingLot> getParkingLotById(long id);

    public ParkingLot save(ParkingLot parkingLot);
}
