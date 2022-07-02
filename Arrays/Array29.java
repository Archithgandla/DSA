//Rain Water Trapping problem
//Approach source : https://www.youtube.com/watch?v=UZG3-vZlFM4&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=16
//Time : O(n)
//space : O(n)


public class Array29 {

    static int trappingWater(int[] arr){
        
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int sum = 0;
        left[0] = arr[0];
        right[arr.length-1] =  arr[arr.length-1];

        for(int i=1;i<left.length;i++){
            left[i] = Math.max(arr[i],left[i-1]);

        }

        for(int j=arr.length-2;j>=0;j--){
            right[j] = Math.max(arr[j],right[j+1]);
        }
    
        for(int i=0;i<arr.length;i++)
            sum = sum+Math.min(left[i],right[i])-arr[i];

        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr));
    }
}
