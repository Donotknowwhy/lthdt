/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoNhiPhanTu1DenN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t --> 0){
            int n = in.nextInt();
            Queue<Long> queue = new LinkedList<>();
            queue.add(1L);
            while(n>0){
                long x = queue.peek();
                queue.poll();
                System.out.print(x+" ");
                queue.add(x*10);
                queue.add(x*10 + 1);
                n--;
            }
            System.out.println("");
        }
    }
}
