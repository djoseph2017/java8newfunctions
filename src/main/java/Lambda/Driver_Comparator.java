package Lambda;

import java.util.Comparator;

public class Driver_Comparator {

    public static void main(String[] args) {
        //prior to java 8
        Comparator<Integer> comparator_legacy = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };

        System.out.println("Legacy--->"+comparator_legacy.compare(50,20));

        //using lambdas

        Comparator<Integer> comparator_lambda = (a,b)->a.compareTo(b);


        System.out.println("Lambda--->"+comparator_lambda.compare(30,20));


    }
}
