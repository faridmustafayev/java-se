package sevenLesson.bounds.exception2;

public class UnderTheAgeException extends Exception {

    public String messageCustom = "Under the age exception ";

    public UnderTheAgeException(String message) {
        super(message);
    }


    @Override
    public String getMessage() {
        return messageCustom + " : " + super.getMessage();
    }
}
