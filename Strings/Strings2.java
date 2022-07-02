//String Palindrome

public class Strings2 {

    static boolean isPalindrome(String a){

        for(int i = 0;i<a.length()/2;i++){

            if(a.charAt(i) == a.charAt(a.length()-i-1))
                continue;

            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isPalindrome("madam"));
    }
}
