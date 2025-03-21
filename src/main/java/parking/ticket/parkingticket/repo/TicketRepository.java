package parking.ticket.parkingticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import parking.ticket.parkingticket.entity.Ticket;

import java.util.Optional;
@Repository
public interface TicketRepository  extends JpaRepository<Ticket,Long> {

    public Ticket save(Ticket ticket);

    public Optional<Ticket> getTicketById(long ticketId);
}
