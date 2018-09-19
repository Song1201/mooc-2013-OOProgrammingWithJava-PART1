import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        Scanner keyboard = new Scanner(System.in);
        BirdDatabase birdDatabase = new BirdDatabase();
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        while(true) {
            System.out.print("? ");
            String command = keyboard.nextLine();
            if(command.equals("Add")){
                birdDatabase.add(keyboard);
            } else if(command.equals("Observation")) {
                birdDatabase.observe(keyboard);
            } else if(command.equals("Show")) {
                birdDatabase.show(keyboard);
            } else if(command.equals("Statistics")) {
                birdDatabase.statistics();
            } else if(command.equals("Quit")) {
                break;
            }
        }
    }

}
