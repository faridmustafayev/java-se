package fullRepeat.lessinFive;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        try {
            check(-21);
        }catch (UnderTheAgeException exception) {
            System.out.println(exception.getMessage() + " : " + exception.localDateTime);
        }

    }

    public static void check(int age) {

        if (age < 0)
            throw new UnderTheAgeException("can not be negative ", LocalDateTime.now());
    }
}

class UnderTheAgeException extends RuntimeException {

    LocalDateTime localDateTime;

    public UnderTheAgeException(String message, LocalDateTime localDateTime) {
        super(message);
        this.localDateTime = localDateTime;
    }

    public String getMessage() {
        return super.getMessage();
    }

}