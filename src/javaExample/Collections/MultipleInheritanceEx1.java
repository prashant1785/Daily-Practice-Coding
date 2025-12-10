package Collections;

interface GrandFather011{
    void showGrandFather();
}
interface Parent011 {
    public void showParent();
}
class Child011 implements GrandFather011,Parent011{
    @Override
    public void showGrandFather() {
        System.out.println("This is GrandFather");
    }
    @Override
    public void showParent() {
        System.out.println("This is Parent");
    }
}
public class MultipleInheritanceEx1 {
    public static void main(String[] args) {
        Child011 child = new Child011();
        child.showGrandFather();
        child.showParent();
    }
}
