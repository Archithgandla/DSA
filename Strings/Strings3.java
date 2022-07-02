//Find the duplicate characters in the string

//Approach:1 
//Use nested loop and count the number of occurences of each character 
//If the occurence of a particular character is greater than 1 print that character
//Time : O(n^2) Space : O(1)

import java.util.*;

public class Strings3 {

    static void findDuplicates(String a){

        HashMap<Character,Integer> ht= new HashMap<>();

        for(int i=0;i<a.length();i++){
            int b = ht.getOrDefault(a.charAt(i),0);
            ht.put(a.charAt(i),b+=1);
        }

        for(char ch : ht.keySet()){

            if(ht.get(ch)>1)
                System.out.println(ch +" : "+ht.get(ch));
        }
    }

    public static void main(String[] args) {

        findDuplicates("madam");
    }
}




