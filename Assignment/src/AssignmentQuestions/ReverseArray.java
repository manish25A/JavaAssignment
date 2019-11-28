
//Q.N.2


package AssignmentQuestions;
import java.util.Scanner;
    public class ReverseArray {

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            int[] arr = new int [5];
            for (int i=0;i<arr.length;i++)
            {
                System.out.println("Enter element:");
                arr[i] = s.nextInt();
            }
            System.out.println("Original array: ");
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Array in reverse order: ");
            for (int i = arr.length-1; i >= 0; i--)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
/*
ALGORITHM:
START
  DECLARE arr[5]
    FOR (DECLARE i=0;i less than length of arr;i++)
       DISPLAY 'Enter element'
       DISPLAY 'Original Array:'
    FOR(DECLARE i=0; i<arr.length ; i++)
       DISPLAY arr[i]
       DISPLAY 'Array in reverse order:'
    FOR(i= arr.length-1; i>=0; i--)
       DISPLAY a[i]
END
        */


