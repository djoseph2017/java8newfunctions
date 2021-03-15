package parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static long checkForPerformance(Supplier<Integer> integerSupplier, int range){
        long start = System.currentTimeMillis();
        IntStream.range(0,range)
                .forEach((x)->{
                    integerSupplier.get();
                });
        long end = System.currentTimeMillis();

        return end-start;
    }


    public static int sunSequencial(){
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }

    public static int sumParallel(){
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequencial : "+
                checkForPerformance(ParallelStreamExample::sunSequencial,10));
        System.out.println("Parallel : "+
                checkForPerformance(ParallelStreamExample::sumParallel,10));
    }
}
