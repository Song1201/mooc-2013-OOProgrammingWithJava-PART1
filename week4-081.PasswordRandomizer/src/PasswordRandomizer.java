import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random randomizer = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        int i = 0;
        while (i<this.length) {
            password += "abcdefghijklmnopqrstuvwxyz".charAt(randomizer.nextInt(26));
            i++;
        }
        return password;
    }
}
