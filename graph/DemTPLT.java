/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemTPLT {
   static int n, m;
    static int coun;
    static List<Integer>[] lists = new ArrayList[20005];
    static boolean check[] = new boolean[20005];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            lists[i] = new ArrayList<>();
            check[i] = true;
        }
        for (int i = 1; i <= m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            lists[x].add(y);
            lists[y].add(x);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                check[j] = true;
            }
            coun = 0;
            check[i] = false;
            for (int j = 1; j <= n; j++) {
                if (check[j]) {
                    bfs(j);
                    coun++;
                }
            }
            System.out.println(coun);
        }
    }

    public static void bfs(int j) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(j);
        check[j] = false;
        while (!queue.isEmpty()) {
            int k = queue.poll();
            for (Integer l : lists[k]) {
                if (check[l]) {
                    queue.add(l);
                    check[l] = false;
                }
            }
        }
    }
 
}
