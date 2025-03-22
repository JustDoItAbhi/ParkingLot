package parking.ticket.parkingticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import parking.ticket.parkingticket.dtos.reponse.ParkingLotResponseDto;
import parking.ticket.parkingticket.dtos.request.ParkingLotRequestDto;
import parking.ticket.parkingticket.entity.ParkingLot;
import parking.ticket.parkingticket.service.ParkingLotService;

import java.util.HashMap;

@RestController
@RequestMapping("/lot")
public class LotController {
    @Autowired
    private ParkingLotService service;
@PostMapping("/create")
    public ResponseEntity<ParkingLotResponseDto> create(@RequestBody ParkingLotRequestDto dto){
    return ResponseEntity.ok(service.create(dto));
}
    @GetMapping("/{id}")
    public ResponseEntity<ParkingLotResponseDto> getById(@PathVariable("id")Long Id){
        return ResponseEntity.ok(service.findById(Id));
    }
    @GetMapping("/")
    public ResponseEntity<HashMap<Long, ParkingLotResponseDto>> findaLL(){
        return ResponseEntity.ok(service.findAll());
    }
}
