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
public class DinhThat {
    static int n, m, u, v;
    static List<Integer>[] lists = new ArrayList[103];
    static int chuaxet[] = new int[103];
    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            res = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            u = scanner.nextInt();
            v = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                lists[i] = new ArrayList<>();
            }
            for (int i = 1; i <= m; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                lists[x].add(y);
            }
            for (int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++){
                    chuaxet[j] = 0;
                }
                if (i != u && i != v) {
                    chuaxet[i] = 1;
                    if(!bfs()){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }

    public static boolean bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        chuaxet[u] = 1;
        while (!queue.isEmpty()){
            int x = queue.poll();
            for(Integer k : lists[x]){
                if(chuaxet[k] == 0){
                    if(k == v){
                        return true;
                    }
                    chuaxet[k] = 1;
                    queue.add(k);
                }
            }
        }
        return false;
    }

}
