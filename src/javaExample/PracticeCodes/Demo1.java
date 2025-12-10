package PracticeCodes;

import java.util.ArrayList;

class Stu{
    int id;
     String city;

    public Stu(int id, String city)
    {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Demo1
{
    public static void main(String[] args) {

        ArrayList<Stu> stu = new ArrayList<>();
        stu.add(new Stu(101,"Mumbai"));
        stu.add(new Stu(1022,"Pune"));

        for (Stu data : stu)
        {
            System.out.println(data);
        }
    }
}
