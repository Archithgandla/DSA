//Longest palindrome substring

public class strings8 {

    static String lcp(String a,String b){
        
        int i=0;
        StringBuilder res = new StringBuilder();
        
        while(i<a.length() && i<b.length()){
            
            if(a.charAt(i) != b.charAt(i)){
                break;
            }
            
            res.append(a.charAt(i));
            i+=1;
            
        }
        
        return res.toString();
    }

    public String longestCommonPrefix(String[] strs) {
           
        String prefix = strs[0];
        
        for(int i = 1;i<strs.length;i++){
            
            prefix = lcp(strs[i],prefix);
            
        }
        
        return prefix;
    }


    public static void main(String[] args) {
        
       

    }
}
