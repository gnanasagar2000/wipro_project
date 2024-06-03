public class sumarray {
    public static void main(String[] args) {
        int[] array={4, 7, 5, 9, 2,};
        int sum=sumArray(array,array.length);
        System.out.println("Sum of the array: "+sum);
    }
    public static int sumArray(int[] array, int length) {
        if (length==0) {
            return 0;
        }
        else {
            return array[length-1]+sumArray(array,length-1);
        }
    }
}


