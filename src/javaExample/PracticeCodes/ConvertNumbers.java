package PracticeCodes;

public class ConvertNumbers
{
    public static void main(String[] args)
    {
        int num1 = 220;
        String binary = Integer.toBinaryString(num1);
        System.out.println("Number convert into binary: "+ binary);

        String hexa = Integer.toHexString(num1).toUpperCase();
        System.out.println("Number convert into Hexadecimal: "+ hexa);

        String octal = Integer.toOctalString(num1);
        System.out.println("Number convert into Octal: "+ octal);

        String binaryStr = "10101";
        int decimal = Integer.parseInt(binaryStr,2);
        System.out.println("Binary convert into Decimal: "+ decimal);
    }
}
