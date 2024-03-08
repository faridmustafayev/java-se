package lastFullRepeat.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Farid"));
        personList.add(new Person("Oruc"));
        personList.add(new Person("Javid"));
        personList.add(new Person("Firdovsi"));
        personList.add(new Person("Farid"));
        personList.add(new Person("Xan"));


        Map<Integer, List<Person>> listMap = collectToMap(personList);
        System.out.println(listMap);


    }

    public static Map<Integer, List<Person>> collectToMap(List<Person> list) {

        return list.stream().collect(Collectors.groupingBy(p-> p.getName().length()));
    }

}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}