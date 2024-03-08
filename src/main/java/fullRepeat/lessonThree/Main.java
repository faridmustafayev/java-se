package fullRepeat.lessonThree;

public class Main {
    public static void main(String[] args) {


        Blocks blocks = new Blocks(21);


    }
}


class Blocks {

    public int weight;
    public static String ID;

    {
        System.out.println(weight);
    }

    static {
        ID = "050";
        System.out.println(ID);
    }

    public Blocks(int weight) {
        this.weight = weight;
        System.out.println("blocks constructor");
    }
}