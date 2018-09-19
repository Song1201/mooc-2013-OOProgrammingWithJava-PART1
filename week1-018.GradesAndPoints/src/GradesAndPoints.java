
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        System.out.println();
        if (points<30){
            System.out.println("Grade: failed");
        } else{
            System.out.println("Grade: " + (points-25)/5);            
        }
        

    }
}
