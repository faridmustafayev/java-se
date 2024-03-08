package sixLesson.secondProgram;

public class Car {
    static int doorCount;
    static Engine engine;
    int speed;
    String color;

    public void start() {
        increaseSpeed(20);
        increaseSpeed(20);
    }

    public void showSpeed() {
        System.out.println(speed);
    }

    public void increaseSpeed(int speed) {
        if (this.speed + speed < 240) {
            this.speed += speed;
        }else {
            this.speed = 240;
        }
    }

    public void decreaseSpeed(int speed) {
        if (this.speed > 1) {
            this.speed -= speed;
        }
    }

    public void brake() {
        decreaseSpeed(this.speed);
    }

}
