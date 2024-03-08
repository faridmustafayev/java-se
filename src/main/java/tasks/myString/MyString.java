package tasks.myString;

import java.util.Arrays;

public final class MyString {
    public char[] text;
    public MyString(char[] text) {
        this.text = text;
    }

    public int length() {
        return text.length;
    }

    public char charAt(int index) {

        if (index > text.length) throw new IndexOutOfBoundsException();
        else if (index < 0) throw new IndexOutOfBoundsException();

        return text[index];
    }

    public boolean equals(MyString otherString) {
        if (Arrays.equals(text, otherString.text)) {
            return true;
        }
        return false;
    }

    public MyString substring(int beginIndex) {
        char[] newValue = new char[text.length - beginIndex];

        int counter = 0;
        for (int index = beginIndex; index < text.length; index++) {
            System.out.println(counter + "  --  " + index);
            newValue[counter++] = text[index];
        }
        return new MyString(newValue);
    }

    public MyString substring(int beginIndex, int endIndex) {
        char[] newValue = new char[endIndex - beginIndex];

        int count = 0;
        for (int index = beginIndex; index <= endIndex; index++) {
            System.out.println(count + " -- " + index);
            newValue[count++] = text[index];
        }
        return new MyString(newValue);
    }



}
