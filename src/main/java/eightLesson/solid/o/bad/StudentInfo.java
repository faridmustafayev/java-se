package eightLesson.solid.o.bad;

public class StudentInfo {
    public String streamName(Student st) {
        if (st instanceof Commerce commerce) {
            return commerce.getStream();
        }
        if (st instanceof Science science) {
            return science.getStream();
        }
        return "";
    }


}

interface Student {
    String getStream();
}

class Commerce implements Student {
    public String getStream() {
        return "commerce";
    }
}

class Science implements Student {
    public String getStream() {
        return "science";
    }
}