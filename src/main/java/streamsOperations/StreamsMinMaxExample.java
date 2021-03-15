package streamsOperations;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> list){
        return list.stream()
                .reduce(Integer.MIN_VALUE,Integer::max);
        //make use of Option<T> so that it can also hold true for null objects
    }
    public static Optional<Integer> findMinValue(List<Integer> list){
        return list.stream()
                .reduce(Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,8,5,3,2);
        System.out.println("Max->"+findMaxValue(list));

        if(findMinValue(list).isPresent())
            System.out.println("Min->"+findMinValue(list).get());

    }
}
