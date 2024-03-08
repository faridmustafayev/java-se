package tasks.memoryGame;

public class Kart {

    private char value;
    private boolean flag;

    public Kart(char value) {
        this.value = value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }


}