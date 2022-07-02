public class SS_4 {
    static int countSquares(int N) {
        // code here
        int count = 0;
        for(int i=1;i*i<N;i++){
            count+=1;
        }
        return count;     
    }
}
