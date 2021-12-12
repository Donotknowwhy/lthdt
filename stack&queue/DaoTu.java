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
public class DaoTu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    while (!st.isEmpty()) {
                        System.out.print(st.peek());
                        st.pop();
                    }
                    System.out.print(" ");
                }else{
                    st.push(s.charAt(i));
                }
                
            }
            while (!st.isEmpty()) {
                System.out.print(st.peek());
                st.pop();
            }
            System.out.println();
        }
    }
}
