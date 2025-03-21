package parking.ticket.parkingticket.repo.inmemory;

import org.springframework.stereotype.Component;
import parking.ticket.parkingticket.entity.Ticket;
import parking.ticket.parkingticket.entity.Ticket;
import parking.ticket.parkingticket.exceptions.InvalidGateException;


import java.util.HashMap;
@Component
public class TicketrRepo implements Repositories<Ticket> {
    HashMap<Long,Ticket>map=new HashMap<>();
    @Override
    public Ticket findById(long id) throws InvalidGateException {
        Ticket ticket= map.get(id);

        if (ticket==null) {
            throw new InvalidGateException("ticket ID NOT VALID");
        }
        return ticket;

    }

    @Override
    public Ticket save(Ticket o) {
        map.put(o.getId(),o);
        return o;
    }

    @Override
    public HashMap<Long, Ticket> findAll() {
        return map;
    }
}
