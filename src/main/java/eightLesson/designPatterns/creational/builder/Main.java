package eightLesson.designPatterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder("Lokesh", "Gupta")
                .age(30)
                .phone("1234567")
                .address("fake address 1234")
                .build();
        System.out.println(user);


        User user1 = new User.UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                .build();
        System.out.println(user1);


        User user2 = new User.UserBuilder("Super", "Man")
                .build();
        System.out.println(user2);

    }
}
