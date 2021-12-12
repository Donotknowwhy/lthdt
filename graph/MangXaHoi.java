/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MangXaHoi {
    static int n, m;
    static List<Integer>[] lists = new ArrayList[100005];
    static boolean check[] = new boolean[100005];
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                lists[i] = new ArrayList();
                check[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                lists[u].add(v);
                lists[v].add(u);
            }
            boolean yes = true;
            for (int i = 1; i <= n; i++) {
                if(!bfs(i)){
                    yes = false;
                }
            }
            if(yes) System.out.println("YES");
            else System.out.println("NO");
        }
    }
 
    private static boolean bfs(int i) {
        if (lists[i].size() > 1) {
            for (int j = 1; j < lists[i].size(); j++) {
                if (!lists[lists[i].get(0)].contains(lists[i].get(j)))
                    return false;
            }
        }
        return true;
    }
}
