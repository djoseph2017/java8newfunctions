package defaults;

public class Client14_InterfaceConflict implements Inteface1,Interface4 {
    public static void main(String[] args) {
        new Client14_InterfaceConflict().methodA();
    }
    //Need to implement in the main class if there is conflict in default methods for
    //Interface1 and Interface4
    @Override
    public void methodA() {
        System.out.println("Inside method A Main class"+Client14_InterfaceConflict.class);
    }
}
