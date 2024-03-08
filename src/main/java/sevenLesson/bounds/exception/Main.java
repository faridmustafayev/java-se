package sevenLesson.bounds.exception;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        try {
            setAge(-23);
        }catch (UnderTheAgeException exception) {
            System.out.println(exception.getMessage() + " : " + exception.exceptionTime);
        }

    }

    public static void setAge(int age) {
        if (age < 0)
            throw new UnderTheAgeException("doesnt mean", LocalDateTime.now());
    }

}