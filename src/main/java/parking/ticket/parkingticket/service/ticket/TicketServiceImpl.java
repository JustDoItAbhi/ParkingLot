//package parking.ticket.parkingticket.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import parking.ticket.parkingticket.entity.*;
//import parking.ticket.parkingticket.exceptions.InvalidGateException;
//import parking.ticket.parkingticket.exceptions.InvalidParkingLotException;
//import parking.ticket.parkingticket.exceptions.ParkingSpotNotAvailableException;
//import parking.ticket.parkingticket.repo.GateRepository;
//import parking.ticket.parkingticket.repo.ParkingLotRepository;
//import parking.ticket.parkingticket.repo.TicketRepository;
//import parking.ticket.parkingticket.repo.VehicleRepository;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class TicketServiceImpl implements TicketService{
//@Autowired
//    private GateRepository gateRepository;
//@Autowired
//    private ParkingLotRepository parkingLotRepository;
//@Autowired
//    private TicketRepository ticketRepository;
//@Autowired
//    private VehicleRepository vehicleRepository;
//
//    @Override
//    public Ticket generateTicket(int gateId, String registrationNumber, String vehicleType) throws InvalidGateException, InvalidParkingLotException, ParkingSpotNotAvailableException {
//        Optional<Gate>savedGate=gateRepository.findById(gateId);
//        if(savedGate.isEmpty()){
//            throw new InvalidGateException("Gate id is not valid");
//        }
//        Gate gate=savedGate.get();
//        if(!gate.getType().equals(GateType.ENTRY)){
//            throw new InvalidGateException("YOU CAN ONLY ENTER VIA ENTERYGATE NOT : "+gate.getType());
//        }
//            Ticket ticket=new Ticket();
//        ticket.setEntryTime(new Date());
//        ticket.setGate(gate);
//        Optional<Vehicle> savedVehicle=vehicleRepository.getVehicleByRegistrationNumber(registrationNumber);
//      if (savedVehicle.isPresent()){
//          throw new InvalidGateException(" vehical number is not valid "+ registrationNumber);
//      }
//        Vehicle vehicle=new Vehicle();
//        if (!vehicle.getVehicleType().equals(vehicleType)){
//            vehicle.setVehicleType(VehicleType.valueOf(vehicleType.toUpperCase()));
//        }
//        vehicle.setRegistrationNumber(registrationNumber);
//
//        ticket.setVehicle(vehicle);
//        List<ParkingFloor>parkingFloorList=new ArrayList<>();
//
//       ParkingFloor floor=new ParkingFloor();
//       floor.setFloorNumber(floor.getFloorNumber());
//       if(floor.getStatus().equals(FloorStatus.CLOSED)){
//           throw new InvalidParkingLotException("FLOOR IS FULL ");
//       }
//
//        parkingFloorList.add(floor);
//        Optional<ParkingLot> savedLot=parkingLotRepository.getParkingLotByGateId(gateId);
//       if(!savedLot.isPresent()){
//           throw new InvalidParkingLotException("parking lot not free "+savedLot.get().getName());
//       }else {
//           ParkingSpot spot=new ParkingSpot();
//           spot.setStatus(ParkingSpotStatus.AVAILABLE);
//           spot.setSupportedVehicleType(VehicleType.valueOf(vehicleType));
//           spot.setNumber(1);
//           ParkingLot lot=savedLot.get();
//           lot.setParkingFloors(parkingFloorList);
//           lot.setName("GROUD FLOOR");
//           lot.setGates(List.of(gate));
//           lot.setAddress("ac market");
//
//       }
//
//        return null;
//    }
//}
