package Lambda;

import java.util.function.Consumer;

public class LamdaVariable2 {

     static int value_1 = 50;
    public static void main(String[] args) {

        int value = 4;//execptions for local variables
        Consumer<Integer> consumer = (integer) -> {
            int a  =12;
            a++;
            System.out.println(a);
            // value++;Variable used in lambda expression should be final or effectively final
            value_1++;//can be used as a Class variable - static
            System.out.println(value+integer);
        };
        //value = 6;local vraibles cannot be accessed
        value_1 = 0;//static class variable - can be accese
        consumer.accept(10);
    }
}
