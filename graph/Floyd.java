/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Floyd {
    static int a[][] = new int[1005][1005];
    static int n;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) a[i][j] = 0;
                else a[i][j] = (int) 1e9;
            }
        }
        for (int i = 1; i <= m; i++) {
            int u = scanner.nextInt(), v = scanner.nextInt(), w = scanner.nextInt();
            a[u][v] = w;
            a[v][u] = w;
        }
        floyd();
        int q = scanner.nextInt();
        while (q-->0){
            int x = scanner.nextInt(),y = scanner.nextInt();
            System.out.println(a[x][y]);
        }
    }

    private static void floyd() {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (a[i][j] > a[i][k] + a[k][j]) {
                        a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }
    }


}
