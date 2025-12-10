package Collections;

interface A01{
    default void sayHello()
    {
        System.out.println("Hello A01");
    }
}
interface B01{
    default void sayHello()
    {
        System.out.println("Hello B01");
    }
}
class C01 implements A01, B01{
    public void sayHello(){
        A01.super.sayHello();
        B01.super.sayHello();
        System.out.println("Hello C01");
    }
}
public class MultipleInheritanceEx2 {
    public static void main(String[] args) {
        new C01().sayHello();
    }
}
