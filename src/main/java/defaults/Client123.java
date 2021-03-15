package defaults;

public class Client123 implements Inteface1,Interface2,Interface3{
    public void methodA(){ //overriding the default method in the implementation class.
        System.out.println("Inside method A "+ Client123.class);
    }
    //Priority 1st - main class(Client123)
    //Priority 2nd - child class(Interface 2)
    //Last - original class(Interface 1)
    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA();
        client123.methodB();
        client123.methodC();
    }
}
