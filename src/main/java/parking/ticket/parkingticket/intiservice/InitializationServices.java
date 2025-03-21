//package parking.ticket.parkingticket.intiservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import parking.ticket.parkingticket.entity.*;
//import parking.ticket.parkingticket.repo.inmemory.GateRepo;
//import parking.ticket.parkingticket.repo.inmemory.ParkingLotRepo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//@Service
//public class InitializationServices {
//        private GateRepo gateRepo;
//        private ParkingLotRepo lotRepo;
//@Autowired
//    public InitializationServices(GateRepo gateRepo, ParkingLotRepo lotRepo) {
//        this.gateRepo = gateRepo;
//        this.lotRepo = lotRepo;
//    }
//
//    public InitializationServices() {
//
//    }
//
//    public ParkingLot createParking(){
//        Random random=new Random();
//        ParkingLot lot=new ParkingLot();
//        lot.setName("ram bhag parking lot");
//        lot.setId(random.nextLong());
//        lot.setAddress("cha road ludhiana");
//        List<ParkingFloor>floorList=new ArrayList<>();
//        for(int i=1;i<=10;i++){
//            ParkingFloor floor=new ParkingFloor();
//            floor.setId(i);
//            floor.setFloorNumber(i*100);
//            floor.setStatus(FloorStatus.OPERATIONAL);
//            List<ParkingSpot>spotList=new ArrayList<>();
//            for(int j=1;j<=10;j++) {
//                ParkingSpot spot = new ParkingSpot();
//                spot.setId(j);
//                spot.setStatus(ParkingSpotStatus.AVAILABLE);
//                spot.setNumber((i*100)+j);
//                spot.setSupportedVehicleType(VehicleType.BIKE);
//            }
//            floor.setSpots(spotList);
//            Gate entryGate=new Gate();
//            entryGate.setName("svitanok main gate");
//            entryGate.setId((i*1000)+1);
//            entryGate.setType(GateType.ENTRY);
//            ParkingAttendant parkingAttendant=new ParkingAttendant();
//            parkingAttendant.setName("sham lala");
//            parkingAttendant.setId(i*10);
//            parkingAttendant.setEmail("sham@mail.com");
//            entryGate.setParkingAttendant(parkingAttendant);
//
//
//            Gate exitGate =new Gate();
//            exitGate.setType(GateType.EXIT);
//            exitGate.setId(i*20);
//            exitGate.setName("svitanok back gate");
//            ParkingAttendant attendant=new ParkingAttendant();
//            attendant.setId(i);
//            attendant.setName("rama lala");
//            attendant.setEmail("rama@mail.com");
//            gateRepo.save(entryGate);
//            gateRepo.save(exitGate);
//            }
//        lot.setParkingFloors(floorList);
//        lotRepo.save(lot);
//    return lot;
//    }
//
//}
