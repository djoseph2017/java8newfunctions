package defaults;

public interface Interface4 {
    default void methodA(){
        System.out.println("Inside method A"+Inteface1.class);
    }
}