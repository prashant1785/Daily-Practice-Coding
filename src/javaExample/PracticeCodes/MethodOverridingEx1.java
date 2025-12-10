package PracticeCodes;

class Shape{
    void drow()
    {
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    @Override
    void drow() {
        super.drow();
        System.out.println("Drawing Circle");
    }
}
public class MethodOverridingEx1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.drow();
//        Shape shape = new Shape();
//        shape.drow();

    }
}
