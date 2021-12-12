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
public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            Stack<Integer> stack = new Stack<>();
            String s = in.nextLine();
            stack.push(-1);
            int Max = 0;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i) == '(') stack.push(i);
                else{
                    stack.pop();
                    if(stack.size() >0) Max = Math.max(Max, i-stack.peek());
                    if(stack.size() == 0) stack.push(i);
                }
            }
            System.out.println(Max);
        }
    }
}
