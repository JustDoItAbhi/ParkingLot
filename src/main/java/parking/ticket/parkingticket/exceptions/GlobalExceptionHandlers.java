package parking.ticket.parkingticket.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlers {
@ExceptionHandler(InvalidGateException.class)
    public ResponseEntity<MessageDto> invalidGate(InvalidGateException e){
    MessageDto dto=new MessageDto(e.getMessage(),404);
    return new ResponseEntity<>(dto,HttpStatus.FORBIDDEN);
}
    @ExceptionHandler(InvalidParkingLotException.class)
    public ResponseEntity<MessageDto> invalidParking(InvalidParkingLotException e){
        MessageDto dto=new MessageDto(e.getMessage(),404);
        return new ResponseEntity<>(dto,HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(ParkingSpotNotAvailableException.class)
    public ResponseEntity<MessageDto> invalidParkingNotAvailable(ParkingSpotNotAvailableException e){
        MessageDto dto=new MessageDto(e.getMessage(),404);
        return new ResponseEntity<>(dto,HttpStatus.FORBIDDEN);
    }


}
