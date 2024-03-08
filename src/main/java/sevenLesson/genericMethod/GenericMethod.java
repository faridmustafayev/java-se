package sevenLesson.genericMethod;

import sevenLesson.test.MyGenericDataStructure;
public class GenericMethod {
    public static <T> void generic(T t) {
        System.out.println("generic : " + t);
    }

    public static <T> MyGenericDataStructure<T> generic2(T t) {
        System.out.println("generic 2 : " + t);
        return new MyGenericDataStructure<>();
    }

    public <T> void generic3(T t) {
        System.out.println("generic 2 : " + t);
    }
}
