/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class QuayLaiDinh1 {
    static int n, m;
    static List<Integer>[] lists = new ArrayList[1003];
    static boolean chuaxet[] = new boolean[1003];
    static int truoc[] = new int[1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i <= n; i++) {
                lists[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                lists[x].add(y);
            }
            bfs(1);
            Stack<Integer> stack = new Stack<>();
            stack.add(2);
            while (stack.peek() != 1) {
                stack.push(truoc[stack.peek()]);
            }
            while (!stack.isEmpty()) {
                set.add(stack.pop());
            }
            for (int i = 0; i <= n; i++) {
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            bfs(2);
            stack.add(1);
            while (stack.peek() != 2) {
                stack.push(truoc[stack.peek()]);
            }
            while (!stack.isEmpty()) {
                set.add(stack.pop());
            }
            System.out.println(set.size());
        }
    }

    private static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaxet[s] = false;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (Integer y : lists[x]) {
                if (chuaxet[y]) {
                    truoc[y] = x;
                    queue.add(y);
                    chuaxet[y] = false;
                }
            }
        }
    }

}
