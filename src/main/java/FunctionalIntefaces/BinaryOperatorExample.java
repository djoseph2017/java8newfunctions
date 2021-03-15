package FunctionalIntefaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        /*Both the input and the single ouput is the same data type*/
        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

        System.out.println(binaryOperator.apply(3,4));

        System.out.println(comparator.compare(5,6));

        System.out.println("Result is: Max->" + BinaryOperator.maxBy(comparator).apply(5, 6));

        System.out.println("Result is: Min->" + BinaryOperator.minBy(comparator).apply(5, 6));

    }

}
