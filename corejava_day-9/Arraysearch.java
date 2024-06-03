public class Arraysearch {

    public static void main(String[] args) {
        int[] array={3, 9, 2, 5, 1, 2, 8};
        int target=5;
        int index=performLinearSearch(array,target);
        if (index !=-1) {
            System.out.println("Element "+target+" found at index " +index);
        } else {
            System.out.println("Element "+target+" not found in the array.");
        }
    }
    public static int performLinearSearch(int[] arr, int target) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}


