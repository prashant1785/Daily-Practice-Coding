package assignment3;
//Create an hightly encapsulated class
public class Que9
{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static void main(String[] args)
    {
        Que9 obj = new Que9();

        obj.setNum1(10);
        obj.setNum2(20);

        System.out.println(obj.getNum1());
        System.out.println(obj.getNum2());
    }
}
