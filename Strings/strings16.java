//Valid parenthesis
import java.util.*;

//Approach - 1 using stack

class strings16{

    static boolean validparenthesis(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
                stack.push(s.charAt(i));
            
            else{

                if(s.charAt(i) == '}'){

                    if(stack.pop() != '{')
                        return false;
                }

                else if(s.charAt(i) == ']'){

                    if(stack.pop() != '[')
                        return false;
                }
                
                else if(s.charAt(i) == ')'){

                    if(stack.pop() != '(')
                        return false;
                } 

            }
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.print(validparenthesis("[(abc])]"));
    }
}

//without using stack : https://github.com/Algorithms-Made-Easy/January-Leetcoding-Challenge-2021/blob/main/20.%20Valid%20Parentheses