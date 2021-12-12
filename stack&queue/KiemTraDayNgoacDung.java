/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            if(Check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean Check(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i< s.length();i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                    if(s.charAt(i) == ')' && stack.peek() == '(' ) stack.pop();
                    else if( s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                    else if(s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                    
                }
            }
        }
        return stack.isEmpty();
    }
}
