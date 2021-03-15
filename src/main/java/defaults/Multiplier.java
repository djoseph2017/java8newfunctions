package defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){//this can be overidden
        System.out.println("Inside interface");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){//this cannot be overiden!!!!

        return integerList!=null && integerList.size()==0;
    }
}
