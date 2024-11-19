package InterfaceExample;

public class Teacher implements  Person{

    @Override
    public void sayHello() {
        System.out.println("Hello World From Teacher");
    }
}
