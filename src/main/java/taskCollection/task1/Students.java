package taskCollection.task1;

public class Students {

    public String name;
    public int groupN;

    public Students(String name, int groupN) {
            this.name = name;

            try {
                if (groupN < 1 || groupN > 4) {
                    throw new RuntimeException("exception: there are four groups (1, 2, 3, 4) ");
                }
                else {
                    this.groupN = groupN;
                }
            }
            catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
    }

    public int getGroupN() {
        return groupN;
    }

    public String getName() {
        return name;
    }

}