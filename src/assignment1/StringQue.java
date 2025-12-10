package assignment1;

public class StringQue
{
    public static void main(String[] args)
    {
    /* 10 Declare a string variable with name employeeName and print the length.
		 Find the character at 3 index.
		 Check whether string contains “un” or not
		 Remove the starting and ending spaces */

        String empName = "Prashant";

        System.out.println("Employee Name Length : "+empName.length());
        System.out.println("Character at 3 index : "+empName.charAt(3));
        System.out.println(empName.contains("un"));
        System.out.println(empName.trim());


		/* 11  Declare two string of firstName and lastName.
		 Print the full name
		 Check whether the first name ends with second name or not */

        String firstName = "Prashant";
        String lastName = "Domkawale";

        System.out.println(firstName+lastName);
        System.out.println("first name ends with second name : "+firstName.endsWith(lastName));


		/*12  Declare a string variable and assign value of “Hello Flynaut How Are You”
		 Find at which place ‘Y’ is present
		 Replace “how are you” with “Good morning”.
		 Break the string from space and print every elemet separately.
		 Print every character of string*/

        String str = "Hello Flynaut How Are You";

        System.out.println("indexOf Y : "+str.indexOf("Y"));
        System.out.println("Replace : "+ str.replace("How Are You","Good Morning"));

        String [] split1 = str.split(" ");
        System.out.println("print every elemet separately :");

        for (String string : split1)
        {
            System.out.println(string);
        }

        System.out.println("Print every character of string : ");
        for (int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
