package parking.ticket.parkingticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import parking.ticket.parkingticket.dtos.aditiondto.GateRequestDto;
import parking.ticket.parkingticket.entity.Gate;
import parking.ticket.parkingticket.service.gateService.GateService;

import java.util.HashMap;

@RestController
@RequestMapping("/gate")
public class GateController {
    @Autowired
private GateService gateService;
@PostMapping("/create")
    public ResponseEntity<Gate> createGate(@RequestBody GateRequestDto gate){
    return ResponseEntity.ok(gateService.createGate(gate));
}

    @GetMapping("/{id}")
    public ResponseEntity<Gate> getGateById(@PathVariable("id") long ID){
        return ResponseEntity.ok(gateService.findById(ID));
    }
    @GetMapping("/")
    public ResponseEntity<HashMap<Long,Gate>> getGateByall(){
        return ResponseEntity.ok(gateService.getAll());
    }
}
