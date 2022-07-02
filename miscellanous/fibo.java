
class fibo{

    static boolean isFibo(int N){

        int[] series = new int[100];
        series[0] = 0;
        series[1] = 1;
        int i = 1;

        while(series[i]<=N){
            i+=1;
            series[i] = series[i-1]+series[i-2];

            if(series[i] == N)
                return true;

        }

        return false;
    }


    public static void main(String[] args) {
        System.out.print(isFibo(90));
    }
}