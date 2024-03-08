package tasks.myString2;

public class Main {
    public static void main(String[] args) {

        MyString myString5 = new MyString(new char[]{'m', 'e'});
        System.out.println(myString5.length());

        System.out.println("--------------------------------------");

        MyString myString6 = new MyString(new char[]{'T', 'a', 'b', 'r', 'i', 'z'});
        System.out.println(myString6.charAt(3));

        System.out.println("--------------------------------------");

        MyString myString7 = new MyString(new char[]{'F', 'a', 'r', 'i', 'd'});
        System.out.println(myString7.substring(2));


        System.out.println("--------------------------------------");

        MyString myString8 = new MyString(new char[]{'E', 'l', 'k', 'h', 'a', 'n'});
        System.out.println(myString8.substring(1, 4));

        System.out.println("--------------------------------------");

        MyString myString1 = new MyString(new char[]{'h', 'e', 'y'}, new char[]{'h', 'e', 'Y'});
        System.out.println("equals value = " + myString1.equals());

        System.out.println("--------------------------------------");

        MyString myString2 = new MyString(new char[]{'H', 'e', 'y'}, new char[]{'h', 'e', 'Y'});
        System.out.println("equalsIgnoreCase value = " + myString2.equalsIgnoreCase());

        System.out.println("--------------------------------------");

        MyString myString3 = new MyString(new char[]{'A', 'z', 'e', 'R', 'b', 'A', 'i', 'J', 'a', 'N'});
        System.out.println("toUpperCase = " + myString3.toUpperCase());

        System.out.println("--------------------------------------");

        MyString myString4 = new MyString(new char[]{'A', 'c', 'c', 'i', 'D', 'E', 'n', 'T'});
        System.out.println("toLowerCase = " + myString4.toLowerCase());


    }

}
