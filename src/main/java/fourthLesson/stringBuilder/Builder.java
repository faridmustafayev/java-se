package fourthLesson.stringBuilder;

public class Builder {

    public static void check() {

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");

        StringBuilder sb2 = sb.append("+end");
        System.out.println(sb);
        System.out.println(sb2);

        System.out.println("---------------------------");

        StringBuilder s = new StringBuilder();
        StringBuilder s2 = new StringBuilder("farid");
        StringBuilder s3 = new StringBuilder(10);
        System.out.println(s3.length());
        s3.append("abc");
        System.out.println(s3.length());
        System.out.println(s2.capacity());  // niye 21 ?

    }
}
