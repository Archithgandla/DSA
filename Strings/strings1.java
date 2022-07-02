//reverse a string

public class strings1 {


    //approach-1
    /*static char[] reversal(String a){

        char[] b = a.toCharArray();
        char temp;

        for(int i=0;i<b.length/2;i++){

            temp = b[i];
            b[i] = b[b.length-i-1];
            b[b.length-i-1] = temp;

        }
        return b;
    }*/


    //Approach-2
    //Better Approach

    static String reversal(String a){

        String b = "";
        char c;

        for(int i = 0;i<a.length();i++){

            c = a.charAt(i);
            b = c+b;
        }

        return b;
    }

    public static void main(String[] args) {

        String arc = "Archith";
        System.out.println(reversal(arc));


    }  
}
