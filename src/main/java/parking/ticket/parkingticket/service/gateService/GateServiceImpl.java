package parking.ticket.parkingticket.service.gateService;

import org.springframework.stereotype.Service;
import parking.ticket.parkingticket.dtos.aditiondto.GateRequestDto;
import parking.ticket.parkingticket.entity.Gate;
import parking.ticket.parkingticket.entity.ParkingAttendant;
import parking.ticket.parkingticket.repo.inmemory.GateRepo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class GateServiceImpl implements GateService{
     GateRepo repo= new GateRepo();
     private static long id=1;
    private static long attendentId=1;
    @Override
    public Gate createGate(GateRequestDto gate) {
        Gate gate1=new Gate();
        gate1.setId(id++);
        gate1.setName(gate.getName());
        List< ParkingAttendant>attendants=new ArrayList<>();
        ParkingAttendant parkingAttendant=new ParkingAttendant();
        parkingAttendant.setName(gate.getParkingAttendant().getName());
        parkingAttendant.setId(attendentId++);
        parkingAttendant.setEmail(gate.getParkingAttendant().getEmail());
        gate1.setParkingAttendant(parkingAttendant);
        repo.save(gate1);
        return gate1;
    }

    @Override
    public Gate findById(long Id) {
        Gate gate=repo.findById(Id);
        return gate;
    }

    @Override
    public HashMap<Long, Gate> getAll() {
        return repo.findAll();
    }
}
