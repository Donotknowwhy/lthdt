/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DuongDiCoHuong {
    static ArrayList<Integer>[] ke = new ArrayList[1005];
    static boolean chuaxet[] = new boolean[1005];
    static int truoc[] = new int[1005];
    static int n, m, s, e;
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            s = in.nextInt();
            e = in.nextInt();
            for (int i = 0; i <= n; i++) {
                ke[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i]=0;
            }
 
            for (int i = 1; i <= m; i++) {
                int x = in.nextInt(), y = in.nextInt();
                ke[x].add(y);
            }
 
            if(bfs(s)){
                StringBuilder st = new StringBuilder();
                while (e != s){
                    st.insert(0, " -> " + e);
                    e = truoc[e];
                }
                st.insert(0, s);
                System.out.println(st);
            }else System.out.println(-1);
        }
    }
 
    public static boolean bfs(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (Integer i : ke[v]) {
                if (chuaxet[i]) {
                    truoc[i] = v;
                    chuaxet[i] = false;
                    q.add(i);
                    if (i == e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
