package elevenLesson.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, String> dates = new HashMap<>();

        dates.put("0", "Namiq");
        dates.put("1", "Cefer");
        dates.put("2", "Royal");
        dates.put("3", "Ferid");

        System.out.println(dates);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        Map<Person, String> dates2 = new HashMap<>();

        dates2.put(new Person("na"), "Namiq");
        dates2.put(new Person("ce"), "Cefer");
        dates2.put(new Person("ro"), "Royal");
        dates2.put(null, "Ferid");
        dates2.put(null, "Xezer");

        System.out.println(dates2);

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        Map<String, Person> dates3 = new HashMap<>();

        dates3.put("key1", new Person("Javid"));
        dates3.put("key2", new Person("Namiq"));
        dates3.put("key3", new Person("Royal"));
        dates3.put("key4", new Person("Xezer"));
        dates3.put("key5", new Person("Orxan"));

        System.out.println(dates3);

        System.out.println(dates3.get("key3"));

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        Map<Key, Person> dates4 = new HashMap<>();

        Key key = new Key("3");

        dates4.put(new Key("1"), new Person("Javid"));
        dates4.put(new Key("2"), new Person("Namiq"));
        dates4.put(key, new Person("Royal"));
        dates4.put(new Key("4"), new Person("Xezer"));
        dates4.put(new Key("3"), new Person("Orxan"));

        System.out.println(dates4);

        System.out.println(dates4.get(key));


    }
}
