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
public class BenPhaiLonHon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            int a[] = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int right[] = new int[n], i;
            Stack<Integer> stack = new Stack<>();
            for (i = n - 1; i >= 0; i--) {
                while (!stack.isEmpty() && a[i] >= a[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    right[i] = -1;
                } else {
                    right[i] = a[stack.peek()];
                }
                stack.push(i);
            }
            for (i = 0; i < n; i++) {
                System.out.print(right[i] + " ");
            }
            System.out.println();
        }
    }

}
