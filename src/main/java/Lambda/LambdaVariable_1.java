package Lambda;

import java.util.function.Consumer;

public class LambdaVariable_1 {

    public static void main(String[] args) {
        int i = 0;
        //Cant pass the same variable as i in below need to change it to i_1
        Consumer<Integer> consumer = (i_1)->{
            //int i = 2; not allowed
            System.out.println(i_1);
        };


    }
}
