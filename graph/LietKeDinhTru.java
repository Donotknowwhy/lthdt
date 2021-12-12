/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LietKeDinhTru {
   static List<Integer>[] lists = new ArrayList[1003];
    static int n, m, count;
    static List<Integer> list = new ArrayList<>();
    static boolean chuaxet[] = new boolean[1003];
    static int tplt;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            tplt = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                lists[i] = new ArrayList<>();
                list = new ArrayList<>();
            }
            for (int i = 1; i <= m; i++) {
                int x = scanner.nextInt(), y = scanner.nextInt();
                lists[x].add(y);
                lists[y].add(x);
            }
            for (int i = 1; i <= n; i++) {
            chuaxet[i] = true;
        }
            for(int i = 1; i <= n; i++){
                if(chuaxet[i]){
                    bfs(i,-1);
                    tplt++;
                }
            }
            for (int i = 2; i <= n; i++) {
                count = 0;
                setUp();
                chuaxet[i] = false;
                for (int j = 1; j <= n; j++) {
                    if (chuaxet[j]){
                        bfs(j, i);
                        count++;
                    }
                }
                if (count > tplt) list.add(i);
            }
            count = 0;
            for (int i = 1; i <= n; i++) {
            chuaxet[i] = true;
        }
            chuaxet[1] = false;
            for (int j = 1; j <= n; j++) {
                if (chuaxet[j]){
                    bfs(j, 1);
                    count++;
                }
            }
            if (count > tplt) list.add(1);
            Collections.sort(list);
            for(Integer i : list)
                System.out.print(i+" ");
            System.out.println();
        }
    }

    private static void setUp() {
        for (int i = 1; i <= n; i++) {
            chuaxet[i] = true;
        }
    }

    public static void bfs(int s, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaxet[s] = false;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (Integer y : lists[x]) {
                if (y != k && chuaxet[y]) {
                    queue.add(y);
                    chuaxet[y] = false;
                }
            }
        }
    }
 
}
