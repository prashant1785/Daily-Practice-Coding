package Oops;

public class EncapsulationEx1
{
    private String stuName;
    private int marks;

    public void setStuName(String stuName)
    {
        this.stuName = stuName;
    }
    public void setMarks(int marks)
    {
        if(marks>=35)
        {
            this.marks = marks;
            System.out.println("pass");
        }
        else
            System.out.println("fail");
    }
//    public String getStuName()
//    {
//        return stuName;
//    }
//    public int getMarks()
//    {
//        return marks;
//    }

}
