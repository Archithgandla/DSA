//import java.util.Arrays;
//import java.lang.Math;
//import java.util.Collections;

//Merge Two sorted arrays without using extra space
//With extra space - copy the elements of both the arrays and store them in a bigger array,sort the bigger array and finally copy them into /individual arrays


//Without extra space
//approach-1 Time complexity : O(nmlog(m))

//Approach -2

/*
class Array12{


    static int max(int[] num){

        int max = 0;

        for(int i=0;i<num.length;i++){

            if(num[max]<num[i]){
                max = i;
            }
        }
        return max;
    }

    static void merge(int[] a,int[] b){

        int temp = 0;
        for(int i=0;i<a.length;i++){

            if(a[i]<b[max(b)]){
                temp = a[i];
                a[i] = b[max(b)];
                b[max(b)] = temp;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }


    public static void main(String[] args) {
        
        int[] arr1 = {0 ,1 ,2 ,3};
        int[] arr2 = {5 ,6 ,7 ,8 ,9};

        merge(arr2,arr1);
    }

}
*/

//Approach -3 
//Time : O(logn)
//Space : O(1)

import java.util.*;
class TUF{
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
   static void merge(int ar1[], int ar2[], int n, int m) {
  // code here 
  int gap =(int) Math.ceil((double)(n + m) / 2.0);
  while (gap > 0) {
    int i = 0;
    int j = gap;
    while (j < (n + m)) {
      if (j < n && ar1[i] > ar1[j]) {
        swap(ar1[i], ar1[j]);
      } else if (j >= n && i < n && ar1[i] > ar2[j - n]) {
        swap(ar1[i], ar2[j - n]);
      } else if (j >= n && i >= n && ar2[i - n] > ar2[j - n]) {
        swap(ar2[i - n], ar2[j - n]);
      }
      j++;
      i++;
    }
    if (gap == 1) {
      gap = 0;
    } else {
      gap =(int) Math.ceil((double) gap / 2.0);
    }
  }
}
public static void main(String[] args) {
    int arr1[] = {1,4,7,8,10};
	int arr2[] = {2,3,9};
    System.out.println("Before merge:");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();
    merge(arr1, arr2, arr1.length, arr2.length);
    System.out.println("After merge:");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }

  }
}






