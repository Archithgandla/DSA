//In java we can concatenate a string and a number ex : "one"+9 = one9


public class strings7 {
    /*Approach -1 : This can be made much more faster using string builder
    public String countAndSay(int n) {
        
        if(n == 1)
            return "1";
        
        String s = countAndSay(n-1);
        int counter = 0;
        String res = "";
        
        for(int i=0;i<s.length();i++){
            
            counter+=1;
            
            if((i == s.length()-1 )|| (s.charAt(i) != s.charAt(i+1))){
                
                res = res+counter+s.charAt(i);
                counter=0;
            }
               
        }
        
        return res;
    }*/

    public String countAndSay(int n) {
        
        if(n == 1)
            return "1";
        
        String s = countAndSay(n-1);
        int counter = 0;
        //String res = "";
        StringBuilder res = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            
            counter+=1;
            
            if((i == s.length()-1 )|| (s.charAt(i) != s.charAt(i+1))){
                
                //res = res+counter+s.charAt(i);
                
                res.append(counter).append(s.charAt(i));
                counter=0;
            }
               
        }
        
        return res.toString();
    }
    public static void main(String[] args) {
        

    }
}
