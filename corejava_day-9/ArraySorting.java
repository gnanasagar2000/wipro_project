import java.util.Arrays;
import java.util.Random;

public class ArraySorting {

    public static void main(String[] args) {
        int arraySize = 10;
        int[] arrayToSort = initializeArray(arraySize);
        System.out.println("Array to sort: "+Arrays.toString(arrayToSort));
        bruteForceSort(arrayToSort);
        System.out.println("Sorted array: "+Arrays.toString(arrayToSort));
    }
    public static int[] initializeArray(int size) {
        Random rand =new Random();
        int[] array =new int[size];
        for (int i=0;i<size;i++) {
            array[i] = rand.nextInt(100); 
        }
        return array;
    }
    public static void bruteForceSort(int[] arr) {
        int n=arr.length;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j + 1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}


