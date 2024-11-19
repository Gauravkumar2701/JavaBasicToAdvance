package InterfaceExample;

public class Developer implements Person{
    @Override
    public void sayHello() {
        System.out.println("Hello From Developer");
    }
}
