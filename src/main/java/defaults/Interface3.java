package defaults;

public interface Interface3 extends Inteface1,Interface2 {
    default void methodC(){
        System.out.println("Inside method C");
    }
}
