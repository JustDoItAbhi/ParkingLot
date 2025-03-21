package parking.ticket.parkingticket.repo.inmemory;

import org.springframework.stereotype.Component;
import parking.ticket.parkingticket.entity.ParkingLot;
import parking.ticket.parkingticket.exceptions.InvalidGateException;
import parking.ticket.parkingticket.exceptions.InvalidParkingLotException;

import java.util.HashMap;
@Component
public class ParkingLotRepo implements Repositories<ParkingLot>{
    private HashMap<Long,ParkingLot>map=new HashMap<>();
    @Override
    public ParkingLot findById(long id) throws InvalidGateException {
        ParkingLot parkingLot= map.get(id);

          if (parkingLot==null) {
              throw new InvalidParkingLotException("LOT ID NOT VALID");
          }
          return parkingLot;

    }

    @Override
    public ParkingLot save(ParkingLot o) {
        map.put(o.getId(),o);
        return o;
    }

    @Override
    public HashMap<Long, ParkingLot> findAll() {
        return map;
    }
}
