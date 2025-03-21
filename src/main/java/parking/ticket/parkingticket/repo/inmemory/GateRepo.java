package parking.ticket.parkingticket.repo.inmemory;

import org.springframework.stereotype.Component;
import parking.ticket.parkingticket.entity.Gate;
import parking.ticket.parkingticket.exceptions.InvalidGateException;

import java.util.HashMap;
import java.util.List;
@Component
public class GateRepo implements Repositories<Gate>{
    HashMap<Long,Gate>gateHashMap=new HashMap<>();
    @Override
    public Gate findById(long id) {
        Gate gate= gateHashMap.get(id);
        if(gate==null){
            throw new InvalidGateException("not a valid gate id "+id);
        }
        return gate;
    }

        @Override
    public Gate save(Gate gate) {
      gateHashMap.put(gate.getId(), gate);
        return gate;
        }

    @Override
    public HashMap<Long, Gate> findAll() {
        return gateHashMap;
    }


}
