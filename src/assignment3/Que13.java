package assignment3;
//13. Create a class Library with a final method getLibraryName() that prints "Central
//Library".
//Create a subclass SchoolLibrary. Attempt to override the getLibraryName() method and
//observe the behavior.

class Library
{
    final void getLibraryName()
    {
        System.out.println("Central Library");
    }
}
class SchoolLibrary extends Library
{
   /* @Override
    final void getLibraryName()
    {
        System.out.println("School Library");
    }*/
}
public class Que13
{
    public static void main(String[] args)
    {
        SchoolLibrary sl = new SchoolLibrary();
        sl.getLibraryName();
    }
}

/*In Java, a final method cannot be overridden by a subclass.
 If you attempt to override a final method, the compiler will throw an error.*/
