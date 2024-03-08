package twelveLesson.function;

@FunctionalInterface
public interface Checker<T> {
    boolean check(T age);
}

class G implements Checker<Integer>  {
    @Override
    public boolean check(Integer age) {
        return age > 25;
    }
}

class G2 implements Checker<Integer> {
    @Override
    public boolean check(Integer age) {
        return age > 3;
    }
}