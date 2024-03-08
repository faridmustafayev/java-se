package fullRepeat.lessonFour;

public class Main {
    public static void main(String[] args) {

        Block block = new Block(21);


    }
}

class Block extends Blocks {

    public Block(int age) {
        super(age);
        System.out.println("block constructor");
    }

    static {
        System.out.println("Farid");
    }

    {
        System.out.println(21);
    }
}

class Blocks {

    public int age;

    public Blocks(int age) {
        this.age = age;
        System.out.println("blocks constructor");
    }

    {
        System.out.println("iib");
    }
}
