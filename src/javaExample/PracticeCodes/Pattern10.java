package PracticeCodes;

public class Pattern10 {
    public static void main(String[] args) {

        int height = 6,length = 6;

        for (int i = 1; i <= height; i++)
        {
            char ch = 'F';
            for (int j = height; j >= i; j--)
            {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
            length--;
        }
    }
}
