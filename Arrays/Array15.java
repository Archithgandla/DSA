//count inversion

public class Array15 {
    //BruteForce
    //time : O(n^2)
    //space : O(1)
    /*
    static int inversionCount(int[] arr){

        int count = 0;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[i])
                    count+=1;

            }
        }
        return count;
    }
    */

    static int Merge(int[] arr,int[] temp,int left,int mid,int right){

        int count = 0;
        int i = left;
        int j = mid;
        int k = left;

        while((i <= mid-1) && (j <= right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                count = count + (mid - i);
            }
        }
    
        while(i <= mid - 1)
            temp[k++] = arr[i++];
    
        while(j <= right)
            temp[k++] = arr[j++];
    
        for(i = left ; i <= right ; i++)
            arr[i] = temp[i];
        
        return count;
    }

    static int Sort(int[] arr,int[] temp,int left,int right){

        int mid,count = 0;

        if(left<right){

            mid = (left+right)/2;

            count+=Sort(arr,temp,0,mid);
            count+=Sort(arr,temp,mid+1,right);
            count+=Merge(arr,temp,left,mid+1,right);
        }

        return count;
    }


    public static void main(String[] args) {
        
        int[] arr = {1, 20, 6, 4, 5};
        int[] temp = new int[arr.length];

        System.out.println(Sort(arr,temp,0,arr.length-1));

    }    
}
