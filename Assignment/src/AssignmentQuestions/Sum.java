//Q.N.3
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        {
            int i;
            int sum = 0;
            Scanner s = new Scanner(System.in);
            int[] arr = new int[20];
            for (i = 0; i < arr.length; i++)
            {
                System.out.println("Enter the elements:");
                arr[i] = s.nextInt();
            }
            for (i = 0; i < arr.length; i++)
                sum += arr[i];
            {
                System.out.println("sum of the array is " + sum);
            }
        }
    }
}
/*
ALGORITHM:

START
  DECLARE array[20]
  FOR i = 0 TO 19
    DISPLAY 'enter element'
    array[i]=input
   DECLARE sum
   FOR i=0 TO 19
    sum = sum+array[i]
    display sum
END

 */
