package parking.ticket.parkingticket.repo.inmemory;

import org.springframework.stereotype.Component;
import parking.ticket.parkingticket.entity.Gate;
import parking.ticket.parkingticket.entity.ParkingFloor;
import parking.ticket.parkingticket.exceptions.InvalidGateException;

import java.util.HashMap;

@Component
public class ParkingFloorRepo implements Repositories<ParkingFloor> {
    HashMap<Long, ParkingFloor>gateHashMap=new HashMap<>();


   @Override
    public ParkingFloor findById(long id) {
            ParkingFloor floor= gateHashMap.get(id);
            if(floor==null){
                throw new InvalidGateException("not a valid gate id "+id);
            }
            return floor;
            }

    @Override
    public ParkingFloor save(ParkingFloor o) {
        gateHashMap.put(o.getId(), o);
        return o;
    }

    @Override
    public HashMap<Long, ParkingFloor> findAll() {
        return gateHashMap;
    }
}
