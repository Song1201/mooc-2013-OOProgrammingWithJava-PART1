

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    public static int[] copy(int[] array) {
        int[] copy = array.clone();
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reverseCopy = new int[array.length];
        for(int i=array.length-1;i>=0;i--) {
            reverseCopy[array.length-1-i] = array[i];
        }
        return reverseCopy;
    }
}
