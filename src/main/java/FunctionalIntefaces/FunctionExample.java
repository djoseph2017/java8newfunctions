package FunctionalIntefaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> stringStringFunction = (name)->name.toUpperCase();
    static Function<String,String> stringStringFunction_2 = (name)->name.concat(" default");


    public static void main(String[] args) {
        System.out.println(stringStringFunction.apply("java8"));
        System.out.println(stringStringFunction.andThen(stringStringFunction_2).apply("java8"));

        //Note for compose secound paremeter stringStringFunction_2 is applied first and then first
        System.out.println(stringStringFunction.compose(stringStringFunction_2).apply("java8"));



    }
}
