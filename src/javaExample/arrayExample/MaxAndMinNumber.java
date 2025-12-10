package arrayExample;

public class MaxAndMinNumber{
    public static void main(String[] args) {

        int [] arr = {12,45,76,34,88};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Max number: "+ max);
        System.out.println("Min number: "+ min);
    }
}
