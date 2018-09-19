import java.util.Arrays;
        
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int smallest(int[] array) {
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int minIndex = 0;
        for(int i=1;i<array.length;i++) {
            if(array[minIndex]>array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        for(int i=index+1;i<array.length;i++) {
            if(array[index]>array[i]) {
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for(int i=0;i<array.length-1;i++) {
            swap(array,indexOfTheSmallestStartingFrom(array,i),i);
        }
    }

}
