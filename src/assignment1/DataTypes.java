package assignment1;

public class DataTypes
{
    public static void main(String[] args) {
        int numI = 10;
        char numC = 'A';
        short numS = 2;
        byte numB = 1;
        float numF = 10.2f;
        double numD = 20.00;
        boolean numBL = true;
        long numL = 222222222;

    /*  2. Using two integer variables, firstNumber and secondNumber, perform the following
             arithmetic operations and print the results:
           */
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(firstNumber % secondNumber);

        /* 3. Using two integers, a and b, perform and print the results of the following
		      	comparisons:  */

        int a=30;
        int b=50;

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);


		      	 /*4. Declare three boolean variables: isAdult, hasID, and isMember. Set them to sample
		values. Use logical operators to answer the following questions and print the results:
		      	*/

        boolean isAdult = true;
        boolean hasID = false;
        boolean isMember = true;

        boolean num1 = isAdult && hasID;
        System.out.println(num1);

        boolean num2 = isMember || hasID;
        System.out.println(num2);

        boolean num3 = !isMember;
        System.out.println(num3);

		         /*5 Initialize an integer variable x with the value 10. Then, using assignment operators,
		          modify x as follows: */

        int x=10;

        x += 5;
        System.out.println("After adding 5: " + x);
        x -= 3;
        System.out.println("After subt 3: " + x);
        x *= 2;
        System.out.println("After multi by 2: " + x);
        x /= 4;
        System.out.println("After div by 4: " + x);
        x %= 3;
        System.out.println("After mod by 3: " + x);


		          /*6  Declares two integer variables a and b with sample values.
					 Swaps their values without using a third variable.
					 Prints the values of a and b after swapping.*/


        int num5=10;
        int num6=40;

        System.out.println("Before Swaping");
        System.out.println(num5);
        System.out.println(num6);

        int temp=num5;
        num5=num6;
        num6=temp;

        System.out.println("After Swaping");
        System.out.println(num5);
        System.out.println(num6);


        // 7 Declares length and width variables of type double.

        double length = 10.5;
        double width = 7.3;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // 8. Write a program to print the ascii value of a,b,c,d

        char charA = 'a';
        char charB = 'b';
        char charC = 'c';
        char charD = 'd';

        System.out.println("ASCII value '" + charA + "' is: " + (int) charA);
        System.out.println("ASCII value '" + charB + "' is: " + (int) charB);
        System.out.println("ASCII value '" + charC + "' is: " + (int) charC);
        System.out.println("ASCII value '" + charD + "' is: " + (int) charD);

        //  9. Write a program to print the char of 66,67,68,69

        int value1 = 66;
        int value2 = 67;
        int value3 = 68;
        int value4 = 69;

        System.out.println("Character " + value1 + " is: " + (char) value1);
        System.out.println("Character " + value2 + " is: " + (char) value2);
        System.out.println("Character " + value3 + " is: " + (char) value3);
        System.out.println("Character " + value4 + " is: " + (char) value4);
    }

}




