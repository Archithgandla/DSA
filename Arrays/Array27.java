
//Check wheter an array is an subset of another given array

import java.util.*;

//Approach-1 Brute Force
//Check wheter all the elements of the smaller array are in larger array one by one using linear search/Binary Search

public class Array27 {

    /*static boolean isSubset(int[] a,int[] b){
        //b is the smaller array
        for(int i = 0;i<b.length;i++){

            int j;

            for(j = 0;j<a.length;j+=1){
                
                if(b[i] == a[j]){
                    break;
                }
            }

            if(j == a.length)
                return false;
        }
        return true;
    }
    */

    //Approach -2 :Sort the arrays and use two pointer method
    static boolean isSubset(int[] a,int[] b){

        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i = 0;i<a.length;i++)
            hs.put(a[i],hs.getOrDefault(a[i],0));
       
        for(int i = 0;i<b.length;i++){
            if(!hs.containsKey(b[i]))
                return false;
        }
        return true;
    }


    public static void main(String[] args){

        int[] a = {10, 5, 2, 23, 19};
        int[] b = {19, 5, 3};

        System.out.println(isSubset(a,b));

    }
}
