package defaults;

public interface Inteface1 {
    default void methodA(){
        System.out.println("Inside method A"+Inteface1.class);
    }
}
