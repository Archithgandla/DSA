//Longest consecutive subsequence
import java.util.*;


public class Array24 {

    //Approach -1
    //Time : O(nlogn)
    //Space : O(n)
    //Not working for all test cases

    /*
    static int findLongestConseqSubseq(int[] arr){

Arrays.sort(arr);
        
        if(arr.length == 0)
            return 0;
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int max = 1,count = 1;
       
        for(int i=1;i<arr.length;i++){
            
            System.out.print("i : "+i);
            System.out.println("count : "+count);
            
            if(arr[i] == arr[i-1])
                i+=1;
            
            if(arr[i]-arr[i-1] == 1)
                continue;
            
            
            if((arr[i]-arr[i-1] != 1) || i == arr.length-1 ){
            
                if(count>max)
                    max = count;

                count=1;
            }
        }

        return max;
    }
    */

    static int findLongestConseqSubseq(int[] arr){

        HashSet<Integer> hs = new HashSet<>();

        for(int i:arr){
            hs.add(i);
        }

        int ans = 0;
        for(int i=0;i<arr.length;i++){

            if(!hs.contains(arr[i]-1)){
                int j = arr[i]+1;

                while(hs.contains(j))
                    j++;
                
                //if(j-arr[i]>ans)
                //    ans = j-arr[i];

                ans = Math.max(j-arr[i],ans);
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        
        int[] arr = {1,9,3,10,4,20,2};
        System.out.println(findLongestConseqSubseq(arr));
        
    }    
}
