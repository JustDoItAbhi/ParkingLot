package parking.ticket.parkingticket.repo.inmemory;

import parking.ticket.parkingticket.exceptions.InvalidGateException;

import java.util.HashMap;
import java.util.List;

public interface Repositories<T> {
     T findById(long id) ;
     T save(T o);
     HashMap<Long,T> findAll();
}
