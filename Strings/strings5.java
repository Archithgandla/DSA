//TO check wheter two strings are rotation of each other

class strings5{
    //both the approaches work in case of both left and right shifts
    /*approach-1
    static boolean isRotation(String s1,String s2){

        String mine = s1;
        int i = 1;
        while(s1.length()-i>=0){
            
            //System.out.println(s1.length()-i);
            char temp = s1.charAt(s1.length()-i);
            mine = temp+mine;
            i+=1;
            //System.out.println(mine.substring(0,s1.length()));

            if(mine.substring(0,s1.length()).equals(s2))
                return true;
        }

        return false;
        
    }
    */

    //if str2 is a rotation of str1 then str2 must be a part of str1+str1
    //time complexity of indexof() is O(n)

    static boolean isRotation(String s1,String s2){

        return ((s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1));

    }

    public static void main(String[] args){   
        System.out.println(isRotation("ABACD","CDABA"));
    }
}