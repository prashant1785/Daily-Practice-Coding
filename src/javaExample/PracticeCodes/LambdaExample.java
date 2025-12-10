package PracticeCodes;
@FunctionalInterface
interface FunctionalInterfaceEX{
    abstract void sayHello(String name);
}

public class LambdaExample {
    public static void main(String[] args) {
        FunctionalInterfaceEX ex = (name)-> System.out.println("Hello from: "+name);
        ex.sayHello("Prashant");
    }
}
