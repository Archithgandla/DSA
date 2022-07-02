import java.util.Arrays;

//Choclate distrubution problem


public class Array30 {

    static int findMinDiff(int[] arr,int k){

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i=0;i<=(arr.length-k);i++){
            if(arr[i+k-1]-arr[i]<min ){
                min = arr[i+k-1]-arr[i]; 
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        System.out.println(findMinDiff(arr,3));
    }
    
}
