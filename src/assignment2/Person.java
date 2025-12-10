package assignment2;

public class Person
{
    private String name;
    private int age;
    private String phone;

    public void setPerson(String name,int age,String phone)
    {
       this.name = name;
       this.age = age;
       this.phone = phone;
    }
    public void showPerson()
    {
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Phone : "+ phone);
    }

    public static void main(String[] args)
    {
        Person p = new Person();
        p.setPerson("Prashant",22,"8767217078");
        p.showPerson();

    }
}
