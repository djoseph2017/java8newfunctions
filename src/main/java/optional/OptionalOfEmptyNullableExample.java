package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    public static Optional<String> ofNullable(){

        return  Optional.ofNullable("Hello");

    }

    public static Optional<String> of(){

        return  Optional.of("Hello");//always expects a value or else it will give null
        // return  Optional.of(null);

    }

    public static Optional<String> empty(){

        return  Optional.empty();
        // return  Optional.of(null);

    }
    public static void main(String[] args) {

        System.out.println(ofNullable().get());
        System.out.println(of());
        System.out.println(empty().get());
    }
}
