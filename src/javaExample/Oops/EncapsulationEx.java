package Oops;

public class EncapsulationEx
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
            this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args)
    {
        EncapsulationEx ex = new EncapsulationEx();
        ex.setName("Prashant");
        ex.setAge(22);

        System.out.println("Age : " + ex.getAge());
        System.out.println("Name : " + ex.getName());

    }
}
