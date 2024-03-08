package thirteenLesson.three;

public class Main {
    public static void main(String[] args) {

        Human javid = new Human(28, "Javid", 1.83);

        test1(javid);
        test2(javid);
        test3(javid);


    }

    public static void test1(Human human) {
        if (human.age > 18)
            System.out.println("let him ");
    }

    public static void test2(Human human) {
        if (!human.name.equals("Ramiz"))
            System.out.println("this is not Javid");
    }

    public static void test3(Human human) {
        if (human.height > 1.90)
            System.out.println("this man is taller than everyone ");
    }

}

class Human {
    public Integer age;
    public String name;
    public Double height;

    public Human(Integer age, String name, Double heightWithDot) {
        this.age = age;
        this.name = name;
        this.height = heightWithDot;
    }
}