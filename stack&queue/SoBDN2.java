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
public class SoBDN2 {
   public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            System.out.println(solve(String.valueOf(n)));
        }
    }

    private static String solve(String n) {
        Queue queue = new LinkedList<String>();
        queue.add("1");
        if (1 % Integer.parseInt(n) == 0) return "1";
        while (!queue.isEmpty()) {
            String a = (String) queue.poll();
            if (Long.parseLong(a + "0") % Integer.parseInt(n) == 0) return a+"0";
            if (Long.parseLong(a + "1") % Integer.parseInt(n) == 0) return a+"1";
            queue.add(a + "0");
            queue.add(a + "1");
        }
        return "";
    }
 
}
