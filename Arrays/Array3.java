//kth max and kth min
//first sort the array
//use the best sorting algorithm 
//as of now using inbuilt function
//[4,2,1,6,3] sorted array : [1,2,3,4,6]
//kth min at index [k-1]
//kth max at index [length-k]

import java.util.*;

public class Array3 {

    public static void main(String[] args){

        int[] arr = {4,2,1,6,3};
        Arrays.sort(arr);

        //k=4
        System.out.println("4th min : "+arr[4-1]);
        System.out.println("4th max : "+arr[arr.length-4]);

    }
}











