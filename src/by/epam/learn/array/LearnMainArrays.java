package by.epam.learn.array;
import java.util.Arrays;
public class LearnMainArrays {
    public static void main(String[] args){
        int[] arr1 = {1, 9, 3, 8 , 7};
        int[] arr2 = {1, 9 ,3, 11, 5};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.compare(arr1,arr2));
        System.out.println(Arrays.binarySearch(arr1, 3));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
