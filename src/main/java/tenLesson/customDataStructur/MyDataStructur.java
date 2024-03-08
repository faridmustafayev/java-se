package tenLesson.customDataStructur;

import java.util.Iterator;

public class MyDataStructur implements Iterable<String> {

    static String[] values;

    public MyDataStructur(String[] values) {
        this.values = values;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }
}
