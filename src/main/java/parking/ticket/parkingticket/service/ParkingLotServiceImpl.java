package parking.ticket.parkingticket.service;

import org.springframework.stereotype.Service;
import parking.ticket.parkingticket.dtos.reponse.ParkingLotResponseDto;
import parking.ticket.parkingticket.dtos.request.GateEntryRequestDto;
import parking.ticket.parkingticket.dtos.request.GateExitGateRequestDto;
import parking.ticket.parkingticket.dtos.request.ParkingLotRequestDto;
import parking.ticket.parkingticket.entity.*;
import parking.ticket.parkingticket.exceptions.InvalidGateException;
import parking.ticket.parkingticket.mapper.ParkingLotMapper;
import parking.ticket.parkingticket.repo.*;
import parking.ticket.parkingticket.repo.inmemory.GateRepo;
import parking.ticket.parkingticket.repo.inmemory.ParkingFloorRepo;
import parking.ticket.parkingticket.repo.inmemory.ParkingLotRepo;
import parking.ticket.parkingticket.repo.inmemory.SpotRepo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ParkingLotServiceImpl implements ParkingLotService{
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingAttendentRepository parkingAttendentRepository;
    private ParkingFloorRepository floorRepository;
    private ParkingSlotRespository slotRespository;
    private ParkingLotRepo lotRepo;
    private GateRepo gateRepo;
    private ParkingFloorRepo floorRepo;
    private SpotRepo spotRepo;
    HashMap<Long,ParkingLot>map=new HashMap<>();

    public ParkingLotServiceImpl(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingAttendentRepository parkingAttendentRepository, ParkingFloorRepository floorRepository,
                                 ParkingSlotRespository slotRespository, ParkingLotRepo lotRepo, GateRepo gateRepo, ParkingFloorRepo floorRepo, SpotRepo spotRepo) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingAttendentRepository = parkingAttendentRepository;
        this.floorRepository = floorRepository;
        this.slotRespository = slotRespository;
        this.lotRepo = lotRepo;
        this.gateRepo = gateRepo;
        this.floorRepo = floorRepo;
        this.spotRepo = spotRepo;
    }

    @Override
    public ParkingLotResponseDto create(ParkingLotRequestDto dto) {
        ParkingLot lot=new ParkingLot();
        lot.setName(dto.getName());
        lot.setAddress(dto.getAddress());

        //floors
        List<ParkingFloor>floorList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            ParkingFloor floor=new ParkingFloor();
            floor.setFloorNumber(i);
            floor.setStatus(FloorStatus.OPERATIONAL);
            // spots
            List<ParkingSpot>spotList=new ArrayList<>();
            for(int j=1;j<=10;j++){
                ParkingSpot spot=new ParkingSpot();
                spot.setNumber(j);
                spot.setStatus(ParkingSpotStatus.AVAILABLE);
                spot.setSupportedVehicleType(List.of(VehicleType.BIKE,VehicleType.CAR,VehicleType.SUV,VehicleType.TRUCK));
                spotList.add(spot);
                spotRepo.save(spot);
                slotRespository.save(spot);

            }
            floorRepository.save(floor);
            floorList.add(floor);
            floor.setSpots(spotList);
            floorRepo.save(floor);

        }

        lot.setParkingFloors(floorList);

        //gates
        List<Gate>entrygateList=new ArrayList<>();
        for(GateEntryRequestDto entrygateRequest:dto.getEntryGate()){
                Gate gate=new Gate();
                gate.setType(GateType.ENTRY);
                gate.setName(entrygateRequest.getName());
                ParkingAttendant attendant=new ParkingAttendant();
                attendant.setName(entrygateRequest.getParkingAttendant().getName());
                attendant.setEmail(entrygateRequest.getParkingAttendant().getEmail());
                gate.setParkingAttendant(attendant);
                entrygateList.add(gate);
                parkingAttendentRepository.save(attendant);
            gateRepository.save(gate);
            gateRepo.save(gate);
        }
        List<Gate>exitgates=new ArrayList<>();
        for(GateExitGateRequestDto exitGateRequest:dto.getExitGate()){
            Gate gate=new Gate();
            gate.setType(GateType.EXIT);
            gate.setName(exitGateRequest.getName());
            ParkingAttendant attendant=new ParkingAttendant();
            attendant.setName(exitGateRequest.getParkingAttendant().getName());
            attendant.setEmail(exitGateRequest.getParkingAttendant().getEmail());
            gate.setParkingAttendant(attendant);
            parkingAttendentRepository.save(attendant);
            exitgates.add(gate);
            gateRepository.save(gate);
            gateRepo.save(gate);
        }
        lot.setGates(entrygateList);
        lot.setGates(exitgates);
        parkingLotRepository.save(lot);
        lotRepo.save(lot);//in memory storage
        map.put(lot.getId(),lot);

        return ParkingLotMapper.fromEntity(lot);
    }

    @Override
    public ParkingLotResponseDto findById(long id) {
        ParkingLot lot=parkingLotRepository.findById(id).orElseThrow(
                ()->new InvalidGateException("not valid id "+id));
        return ParkingLotMapper.fromEntity(lot);
    }

    @Override
    public HashMap<Long, ParkingLot> findAll() {
//        HashMap<Long,ParkingLotResponseDto>responseDtoHashMap=new HashMap<>();
//        HashMap<Long,ParkingLot>lot=lotRepo.findAll();
//        responseDtoHashMap.put(lot.get());
       return map;
    }
}
