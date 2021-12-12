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
public class KiemTraBieuThucSoHoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            
            if(Check(s)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    
    public static boolean Check(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i) == '(') stack.push(i);
            else if(s.charAt(i) == ')'){
                int j = stack.peek();
                stack.pop();
                if(i - j ==2){
                  
                    return true;
                }
                if(s.charAt(j+1) == '(' && s.charAt(i -1) == ')'){
                   
                    return true;
                }
            }
        }     
        return false; 
    }
    
      
}
