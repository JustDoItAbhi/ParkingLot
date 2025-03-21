package parking.ticket.parkingticket.repo.inmemory;

import org.springframework.stereotype.Component;
import parking.ticket.parkingticket.entity.Vehicle;
import parking.ticket.parkingticket.exceptions.InvalidGateException;

import java.util.HashMap;
@Component
public class VehicleRepo implements Repositories<Vehicle> {
    HashMap<Long,Vehicle>map=new HashMap<>();
    @Override
    public Vehicle findById(long id) {
        Vehicle vehicle=map.get(id);
        if(vehicle==null){
            throw new InvalidGateException("not such vehical availebe with id "+id);
        }
        return vehicle;
    }

    @Override
    public Vehicle save(Vehicle o) {
        return map.put(o.getId(),o);
    }

    @Override
    public HashMap<Long, Vehicle> findAll() {
        return map;
    }
}
