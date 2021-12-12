/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaTriNhoNhatXau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            int k = Integer.parseInt(scanner.nextLine());
            String s = scanner.nextLine();
            System.out.println(solve(k, s));
        }
    }

    private static long solve(int k, String s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int[] dd = new int[26];
        for (int i = 0; i < s.length(); i++)
            dd[s.charAt(i) - 'A']++;
        for (int i = 0; i < 26; i++)
            if (dd[i] > 0) pq.add(dd[i]);
        while (k-->0){
            int a = pq.poll();
            pq.add(a-1);
        }
        long res = 0;
        while (!pq.isEmpty()){
            res += Math.pow(pq.poll(),2);
        }
        return res;
    }

}
