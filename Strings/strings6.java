//Strings valid shuffle
import java.util.*;

public class strings6 {

    /*approach - 1 Entry is a key-value pair. We can compare two HashMap by comparing Entry with the equals() method of the Map returns true if the maps have the same key-value pairs that mean the same Entry

        static boolean isValidShuffle(String a,String b,String c){

        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> sm = new HashMap<>();

        for(int i = 0;i<a.length();i++){
            hm.put(a.charAt(i),hm.getOrDefault(a.charAt(i),0)+1);
        }

        for(int i = 0;i<b.length();i++){
            hm.put(b.charAt(i),hm.getOrDefault(b.charAt(i),0)+1);
        }

        for(int i = 0;i<c.length();i++){
            sm.put(c.charAt(i),sm.getOrDefault(c.charAt(i),0)+1);
        }

        System.out.println(hm);
        System.out.println(sm);

        if(hm.equals(sm))
            return true;
        return false;
    }
    */

    //approach-2 concat s1 and s2 and sort it and also sort s3

    //approach

    static boolean isValidShuffle(String a,String b,String c){

        if(c.length() != a.length()+b.length())
            return false;
        
        int i=0,j=0,k=0;

        while(k<a.length()+b.length()){

            if(i<a.length() && a.charAt(i)==c.charAt(k)){
                i+=1;
                k+=1;
            }

            else if(j<b.length() && b.charAt(j)==c.charAt(k)){
                j+=1;
                k+=1;
            }

            else{
                return false;
            }

        }

        return true;
        
    }

    public static void main(String[] args) {
        
        System.out.println(isValidShuffle("XY1","12","X1Y2"));

    }    
}
