package arrayExample;

import java.util.Arrays;

public class RemoveSpecificElement
{
    public static void main(String[] args) {

        int arr[] = {23,55,78,99,100};
        int removeEle = 55;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != removeEle) {
                System.out.println(arr[i]);
            }
        }
    }
}
