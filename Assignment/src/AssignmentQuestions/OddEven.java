//Q.N.1
package AssignmentQuestions;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        i= s.nextInt();
        if (i%2==0)
        {
            System.out.println(" number is even ");
        }
        else
        {
            System.out.println(" number is odd");
        }
    }
}
/*to find if the number is odd or  even
START
        DECLARE a
        INPUT "enter number"
        IF a%2=0
        DISPLAY "a in even"
        ELSE
        DISPLAY "a is odd"
        END
*/