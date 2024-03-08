package fifthLesson;
public class Custom implements AutoCloseable {

    public void close() throws Exception {
        System.out.println("function will be close ... ");
    }

}
