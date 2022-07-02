//Minimum number of jumps

public class Array10 {

    static int minJumps(int[] arr){

        int sum = arr[0],i=0,k=0;
        while(1){

            if(sum>=arr.length-1)
                return k+1;

            i+=sum;
            sum+=arr[sum];
            
        }

        return -1;

    }

    public static void main(String[] args){
        
        int[] a = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(a));

    }

}
