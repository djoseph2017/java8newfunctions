package DeclarativeStyle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //Using Streams
        List<Integer> collect = list.stream()//make it as stream
                .distinct()//only distinct values
                .collect(Collectors.<Integer>toList());//convert to the one u wanted
        System.out.println(collect);
    }
}
