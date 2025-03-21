package parking.ticket.parkingticket.controller;

import parking.ticket.parkingticket.entity.Ticket;
import parking.ticket.parkingticket.service.ticket.TicketService;
import parking.ticket.parkingticket.dtos.request.GenerateTicketRequestDto;
import parking.ticket.parkingticket.dtos.reponse.GenerateTicketResponseDto;
import parking.ticket.parkingticket.exceptions.InvalidGateException;
import parking.ticket.parkingticket.exceptions.InvalidParkingLotException;
import parking.ticket.parkingticket.exceptions.ParkingSpotNotAvailableException;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) throws ParkingSpotNotAvailableException, InvalidGateException, InvalidParkingLotException {
        Ticket ticket= ticketService.generateTicket(requestDto.getGateId(), requestDto.getRegistrationNumber(), requestDto.getVehicleType());
      GenerateTicketResponseDto responseDto=new GenerateTicketResponseDto();
      responseDto.setTicket(ticket);
        return responseDto;
    }
}