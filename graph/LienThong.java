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
public class LienThong {
   static int n, m, x;
    static List<Integer>[] lists = new ArrayList[1003];
    static boolean chuaxet[] = new boolean[1003];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        x = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            lists[i] = new ArrayList<>();
            chuaxet[i] = true;
        }
        for (int i = 1; i <= m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            lists[a].add(b);
            lists[b].add(a);
        }
        bfs();
        boolean hasRes = false;
        for (int i = 1; i <= n; i++) {
            if(chuaxet[i]){
                System.out.println(i);
                hasRes = true;
            }
        }
        if(!hasRes){
            System.out.println(0);
        }
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        chuaxet[x] = false;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (Integer k : lists[x]) {
                if (chuaxet[k]) {
                    chuaxet[k] = false;
                    queue.add(k);
                }
            }
        }
    }
 
}
