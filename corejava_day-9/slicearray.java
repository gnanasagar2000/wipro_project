public class slicearray {

    public static int[] sliceArray(int[] array,int startIndex,int endIndex) {
        int length=endIndex-startIndex+1;
        int[] slicedArray=new int[length];
        for (int i=0;i<length;i++) {
            slicedArray[i]=array[startIndex+i];
        }
        
        return slicedArray;
    }
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex=2; 
        int endIndex=5;
        int[] slicedArray = sliceArray(originalArray,startIndex,endIndex);
        System.out.print("Sliced Array: ");
        for (int num:slicedArray) {
            System.out.print(num+" ");
        }
    }
}
