//Min Max using divide and conquer


class Pair{
    int min;
    int max;
}


class SS_5{

    static Pair MinMax(int[] arr,int low,int high){
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        if(low == high){
            minmax.min = arr[low];
            minmax.max = arr[high];
        }

        else if(low == high-1){
            if(arr[low]<arr[high]){
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            else{
                minmax.max = arr[low];
                minmax.min = arr[high];
            }
        }

        else{
            int mid = (low+high)/2;
            mml = MinMax(arr,low,mid);
            mmr = MinMax(arr,mid+1, high);

            if(mml.max>mmr.max)
                minmax.max = mml.max;
            else
                minmax.max = mmr.max;


        }
        return minmax;
    }


    public static void main(String[] args) {
        
        int[] arr = {1,7,-4,4,35,0,2};
        Pair a = MinMax(arr,0,arr.length-1);
        System.out.println("MAX : "+a.max);
        System.out.println("MIN : "+a.min);
    }
}