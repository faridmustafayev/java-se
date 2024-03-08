package tasks.myString2;

import java.util.Arrays;

public final class MyString {

    public char[] text;
    public char[] text2;

    public MyString(char[] text) {
        this.text = text;
    }

    public MyString(char[] text, char[] text2) {
        this.text = text;
        this.text2 = text2;
    }

    public int length() {
        return text.length;
    }

    public char charAt(int index) {
        if (index < 0) throw new NegativeArraySizeException("by user");
        else if (index > text.length) throw new ArrayIndexOutOfBoundsException("by user");
        else return text[index];
    }

    public MyString substring(int beginIndex) {

        char[] value = new char[text.length - beginIndex];
        int counter = 0;

        for (int index = beginIndex; index < text.length; index++) {
            value[counter++] = text[index];
        }
        return new MyString(value);
    }

    public MyString substring(int beginIndex, int endIndex) {

        char[] value = new char[endIndex - beginIndex];

        int counter = 0;
        for (int index = beginIndex; index < endIndex; index++) {
            value[counter++] = text[index];
        }
        return new MyString(value);
    }

    public boolean equals() {
        int counter = 0;

        if (text.length == text2.length) {
            for (int index = 0; index < text.length; index++) {
                if (text[index] == text2[index]) {
                    counter++;
                }
            }
        }
        else System.out.println("not equals");

        if (counter != text.length) return false;
        else return true;
    }

    public boolean equalsIgnoreCase() {
        int counter = 0;
        if (text.length == text2.length) {
            for (int index = 0; index < text.length; index++) {
                if (text[index] == text2[index] || text2[index] - text[index] == 32 || text[index] - text2[index] == 32) {
                    counter++;
                }
            }
        }
        if (counter != text.length) return false;
        else return true;
    }

    public MyString toUpperCase() {

        int counter = 0;
        char[] result = new char[text.length];
        for (int index = 0; index < text.length; index++) {
            if (text[index] >= 97 && text[index] <= 122) {

                int value = text[index] - 32;
                char convert = (char) value;
                result[counter++] = convert;
            }
            else {
                result[counter++] =  text[index];
            }
        }
        return new MyString(result);
    }

    public MyString toLowerCase() {

        int counter = 0;
        char[] result = new char[text.length];
        for (int index = 0; index < text.length; index++) {
            if (text[index] >= 65 && text[index] <= 90) {

                int value = text[index] + 32;
                char convert = (char) value;
                result[counter++] = convert;
            }
            else {
                result[counter++] =  text[index];
            }
        }
        return new MyString(result);
    }


    public String toString() {

        return Arrays.toString(text);
    }

}