//Smallest subarray with sum greater than given value

public class Array31{

    //Approach - 1
    //Brute Force
    /*
    static public void smallestSubWithSum(int[] arr,int x){

        int[] min = {0,arr.length-1};

        for(int i=0;i<arr.length;i++){

            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){

                if(sum>x){
                    
                    if(j-i<min[1]-min[0]){
                        min[0] = i;
                        min[1] = j;
                    }
                    break;
                }

                sum = sum+arr[j];
            }
        }

        for(int i = min[0];i<min[1];i++)
            System.out.print(arr[i]+" ");
    }
    */

    //Sliding window technique
    //Time : O(n)
    //Space : O(1)

    
    static public int smallestSubWithSum(int[] arr,int x){


        int start = 0,end = 0,ans = arr.length;
        int sum = 0;

        while(end < arr.length){

            while(sum<=x && end<arr.length){
                sum+=arr[end];
                end+=1;
            }

            while(sum>x && start<arr.length){

                if(end-start<ans)
                    ans = end-start;
                sum-=arr[start];
                start+=1;

            }       

        }

        return ans;

        }

    


    public static void main(String[] args) {

        int A[] = {1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(A,51));
        
    }
}


