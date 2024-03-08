package sevenLesson.bounds.exception2;

public class Main {
    public static void main(String[] args) {

        try {
            setAge(-23);
        }catch (UnderTheAgeException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void setAge(int age) throws UnderTheAgeException {
        if (age < 0)
            throw new UnderTheAgeException("age - ola bilmez");
    }

}
