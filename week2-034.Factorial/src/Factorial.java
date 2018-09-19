import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number ");
        int number = Integer.parseInt(reader.nextLine());
        if (number == 0) {
            System.out.println("Factorial is " + 1);
        } else  {
            int result = 1;
            int i = 1;
            while (i <= number) {
                result *= i;
                i += 1;
            }
            System.out.println("Factorial is " + result);
                  
        }
       

        
    }
}
