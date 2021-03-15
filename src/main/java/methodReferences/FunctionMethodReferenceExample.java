package methodReferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String,String> toUpperCase = s -> s.toUpperCase();

    /*Method Reference
    * ClassName::MethodName*/
    static Function<String,String> toUpperCase_1 = String::toUpperCase;


    public static void main(String[] args) {
        toUpperCase.apply("java8");
        toUpperCase_1.apply("java8");
    }
}
