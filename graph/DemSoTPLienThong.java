/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemSoTPLienThong {
    static int n, m;
    static ArrayList<Integer>[] dske = new ArrayList[1005];
    static boolean chuaxet[] = new boolean[1005];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int i = 0; i <= 1000; i++) {
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            //dem thanh phan lien thong
            int dem =0;
            for (int i = 1; i <= n ; i++) {
                if(chuaxet[i]) {
                    dfs(i);
                    dem++;
                }
            }
            System.out.println(dem);
        }
    }

    public static void dfs(int u){
        chuaxet[u] = false;
        for (int i = 0; i < dske[u].size(); i++) {
            if(chuaxet[dske[u].get(i)]){
                dfs(dske[u].get(i));
            }
        }
    }
}
