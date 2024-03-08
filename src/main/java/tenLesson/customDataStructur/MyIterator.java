package tenLesson.customDataStructur;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator implements Iterator<String> {
    int current = 0;

    @Override
    public boolean hasNext() {
        return current < MyDataStructur.values.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return MyDataStructur.values[current++];
    }
}
