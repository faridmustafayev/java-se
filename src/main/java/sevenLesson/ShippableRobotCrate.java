package sevenLesson;

public class ShippableRobotCrate implements Shippable<Robot> {

    public void ship(Robot t) {
        System.out.println(t);
    }

}
