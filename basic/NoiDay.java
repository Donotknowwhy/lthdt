/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

import java.util.PriorityQueue;
import java.util.Scanner;


public class NoiDay {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int t = sc.nextInt();
            long a;
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int j = 1; j <= t; j++) {
                a = sc.nextLong();
                pq.add(a);
            }
            int result = 0;
            while (pq.size() > 1) {
                long fi = pq.poll();
                long se = pq.poll();
                long k = (fi + se) % mod;
                pq.add(k);
                result += k;
                result %= mod;
            }
            System.out.println(result);
        }

    }

}
