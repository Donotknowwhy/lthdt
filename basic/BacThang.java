/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BacThang {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] dp = new long[n + 5];
            dp[0] = dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= Math.min(i, k); j++) {
                    dp[i] += dp[i - j];
                    dp[i] %= mod;
                }
            }
            System.out.println(dp[n]);
        }
    }
}
