package assignment1;
/*15. Writing a Simple Function:
 Write a Java method named greetUser that takes a String parameter (the
user's name) and prints a greeting message with username
 Call this method in the main method and test it with different names.*/

public class Method1
{
    public static void greetUser(String userName)
    {
        System.out.println("Hello, " + userName + "! Welcome to the Flynaut.");
    }
    public static void main(String[] args)
    {
        greetUser("Prashant");
        greetUser("Rohit");
        greetUser("Avinash");
    }
}
