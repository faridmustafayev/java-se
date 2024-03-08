package sevenLesson;

public class ShippableAbstractCrate<T> implements Shippable<T> {

    public void ship(T t) {
        System.out.println(t);
    }
}
