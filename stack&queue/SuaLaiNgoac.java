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
public class SuaLaiNgoac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            Stack<Character> stack = new Stack<>();
            int res = 0;
            for(int i =0;i< s.length();i++){
                if(!stack.isEmpty()){
                    if(s.charAt(i) == ')' && stack.peek() == '('){
                        stack.pop();
                    }
                    else stack.push(s.charAt(i));
                }else {
                    if(s.charAt(i) == ')'){
                        res++;
                    }
                    stack.push('(');
                }
            }
            while(!stack.isEmpty()){
                char a = stack.peek(); stack.pop();
                char b = stack.peek(); stack.pop();
                if(a !=')' && b!= '(' ){
                    res += 2;
                } else if((a  == ')' && b == ')') || ( a== '(') && b == '(' ){
                        res+=1;
                }
            }
            System.out.println(res);
        }
    }
}
