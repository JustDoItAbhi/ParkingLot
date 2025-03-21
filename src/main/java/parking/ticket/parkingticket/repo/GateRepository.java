package parking.ticket.parkingticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parking.ticket.parkingticket.entity.Gate;

import java.util.Optional;
@Repository
public interface GateRepository  extends JpaRepository<Gate,Long> {

    public Optional<Gate> findById(long gateId);

    public Gate save(Gate gate);
}
