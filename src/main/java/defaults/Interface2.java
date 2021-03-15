package defaults;

public interface Interface2 extends Inteface1 {
    default void methodB(){
        System.out.println("Inside method B"+Inteface1.class);
    }
    @Override
    default void methodA(){
        System.out.println("Method A"+Interface2.class);
    }
}
