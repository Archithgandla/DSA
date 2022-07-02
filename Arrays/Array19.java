import java.util.List;

//Common elements of three sorted arrays
//Approach-1 : Find the intersection of first twoo s



public class Array19 {
    

    static void combine(int[] a,int[] b,int[] c){

        int i=0,j =0,k = 0;

        while(i<a.length && j<b.length && k<c.length){

            if(a[i] == b[j] && b[j] == c[k]){
                System.out.println(a[i]);
                i+=1;
                j+=1;
                k+=1;
            }

            else if(a[i] < b[j]){
                i+=1;
            }

            else if(b[j]<a[k]){
                j+=1;
            }

            else
                k+=1;
        }
      
    }


    public static void main(String args[]){

        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3,4,15,20,30,70,80,120};

        combine(a,b,c);
    }
}
