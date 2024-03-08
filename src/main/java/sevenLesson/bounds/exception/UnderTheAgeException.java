package sevenLesson.bounds.exception;

import java.time.LocalDateTime;

public class UnderTheAgeException extends RuntimeException {

    public LocalDateTime exceptionTime;
    public UnderTheAgeException(String message, LocalDateTime exceptionTime) {
        super(message);
        this.exceptionTime = exceptionTime;
    }

    @Override
    public String getMessage() {
        return (super.getMessage());
    }

}