
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        int i = first;
        int result = 0;
        while (i<=last) {
            result += i;
            i += 1;
        }
        System.out.println("The sum is " + result);
    }
}
