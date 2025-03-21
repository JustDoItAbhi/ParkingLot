package parking.ticket.parkingticket.repo.inmemory;

import org.springframework.stereotype.Component;
import parking.ticket.parkingticket.entity.Gate;
import parking.ticket.parkingticket.entity.ParkingSpot;
import parking.ticket.parkingticket.exceptions.InvalidGateException;

import java.util.HashMap;

@Component
public class SpotRepo implements Repositories<ParkingSpot> {
    HashMap<Long, ParkingSpot> spotHashMap=new HashMap<>();

    @Override
    public ParkingSpot findById(long id) {
        ParkingSpot spot=spotHashMap.get(id);
        if(spot==null){
            throw new InvalidGateException("not a valid spot id "+id);
        }
        return spot;
    }

    @Override
    public ParkingSpot save(ParkingSpot o) {
        return spotHashMap.put(o.getId(), o);
    }

    @Override
    public HashMap<Long, ParkingSpot> findAll() {
        return spotHashMap;
    }
}
