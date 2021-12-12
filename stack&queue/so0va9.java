/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class so0va9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-->0){
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    private static String solve(int n) {
        Queue queue = new LinkedList<String>();
        queue.add("9");
        if(9%n==0)  return "9";
        while (!queue.isEmpty()){
            String a = (String) queue.poll();
            if(Long.parseLong(a+"0") % n ==0)   return a+"0";
            if(Long.parseLong(a+"9") % n ==0)   return a+"9";
            queue.add(a+"0");
            queue.add(a+"9");
        }
        return "";
    }

}
