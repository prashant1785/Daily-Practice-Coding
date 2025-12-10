package arrayExample;

    public class CalculateArrayAverage
    {
        public static void main(String[] args)
        {
            int arr[] = {12,34,65,34,10,79,66,99};

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum+= arr[i];
            }
            double avg = (double) sum/arr.length;
            System.out.println(avg);
        }
    }
