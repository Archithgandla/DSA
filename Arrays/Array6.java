//union and intersection of sorted lists
//union can be directly calculated using set from collections
import java.util.*;

public class Array6 {

    static void union(int[] a,int[] b){

        int i=0,j=0;
        List<Integer> c = new ArrayList<>();

        while(i<a.length && j<b.length){

            if(a[i]<b[j]){
                c.add(a[i]);
                i++;
            }

            else if(a[i]>b[j]){
                c.add(b[j]);
                j++;
            }

            else{
                c.add(a[i]);
                i++;j++;
            }
        }

        while(i<a.length){
            c.add(a[i]);
            i+=1;
        }

        while(j<b.length){
            c.add(b[j]);
            j+=1;
        }

       System.out.println(c);

    }

    static void intersection(int[] a,int[] b){

        int i=0,j=0;

        //Hashset is used so that duplicates can be eliminated which happens if both arrays contains same duplicate elements
        Set<Integer> c = new HashSet<>();

        while(i<a.length && j<b.length){

            if(a[i]<b[j])
                i++;
            

            else if(a[i]>b[j])
                j++;
            

            else{
                c.add(a[i]);
                i++;j++;
            }
        }

       System.out.println(c);

    }



    public static void main(String args[]){

        int[] p = {1,2,3,4,5,6};
        int[] q = {5,6,7,8,9}; 

        union(p,q);
        intersection(p,q);

    }

}
