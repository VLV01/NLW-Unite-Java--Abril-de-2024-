package rocketseat.com.passin.domain.ateendee.exceptions;

public class AttendeeAlreadyExistException extends  RuntimeException{
        public  AttendeeAlreadyExistException(String message) {
            super(message);
        }
}
