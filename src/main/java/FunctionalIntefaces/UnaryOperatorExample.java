package FunctionalIntefaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    /*When the input and the output is the same*/
    static UnaryOperator<String> unaryOperator = (s)->s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
