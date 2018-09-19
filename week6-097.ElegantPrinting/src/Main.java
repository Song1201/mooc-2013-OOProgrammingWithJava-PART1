
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int i = 0;
        for(;i<array.length-1;i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[i]);
    }
}
