package eightLesson.solid.o.good;

public abstract class StudentInfo {
    public abstract String streamName();
}

class Commerce extends StudentInfo {
    public String streamName() {
        return "commerce";
    }
}

class Science extends StudentInfo {
    public String streamName() {
        return "science";
    }
}

class Arts extends StudentInfo {
    public String streamName() {
        return "arts";
    }
}