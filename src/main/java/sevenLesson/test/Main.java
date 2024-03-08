package sevenLesson.test;

public class Main {
    public static void main(String[] args) {

        MyDataStructure myDataStructure = new MyDataStructure();
        myDataStructure.setData("Farid");

//        myDataStructure.setData(21);
        String name = (String) myDataStructure.getData();

        System.out.println("---------------------------------------------");

        MyGenericDataStructure<String> myGenericDataStructure = new MyGenericDataStructure<>();
        myGenericDataStructure.setData("Farid");
        String name2 = myGenericDataStructure.getData();

        MyGenericDataStructure<Integer> myGenericDataStructure1 = new MyGenericDataStructure<>();
        myGenericDataStructure1.setData(21);
        Integer age = myGenericDataStructure1.getData();

        System.out.println("---------------------------------------------");

        // raw use
        MyGenericDataStructure myGenericDataStructure2 = new MyGenericDataStructure();
        myDataStructure.setData("");

        System.out.println("---------------------------------------------");




    }
}
