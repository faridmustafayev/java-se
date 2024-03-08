package secondLesson.wrapper;

public class Wrapper {

    // wrapper classes are objects encapsulating primitive Java types

    // Byte, Short, Integer, Long
    // Float, Double
    // Boolean, Character

    // extends Number
//    Integer integer = new Integer(9); // deprecated
    Integer integer1 = Integer.valueOf(5);
    Integer integer2 = 3;

    int intVariable = integer1.intValue();
    float floatValue = integer1.floatValue();


    /*
    boxing      primitive -> wrapper
    Integer number = 5;

    unboxing      wrapper -> primitive
    int number = Integer.intValue();
     */


    /*
    int primitiveInt = 3;
    Integer boxedInt = primitiveInt;   //Auto boxing
    Integer boxedInt = Integer.valueOf(primitiveInt);  // dolayisi ile bu sekildedir

    Integer boxedInt = 42;
    int primitiveInt = boxedInt;       // Auto unboxing
    int primitiveInt = boxedInt.intValue();

    example:
    Integer number = 5;
    if(number < 4){
        System.out.println();
    }

     */

}
