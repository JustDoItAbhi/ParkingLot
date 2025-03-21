package parking.ticket.parkingticket.service.gateService;

import parking.ticket.parkingticket.dtos.aditiondto.GateRequestDto;
import parking.ticket.parkingticket.entity.Gate;

import java.util.HashMap;

public interface GateService {
    Gate createGate(GateRequestDto gate);
    Gate findById(long Id);
    HashMap<Long,Gate>getAll();
}
