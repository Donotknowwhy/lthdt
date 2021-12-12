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
public class SoBDN1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            soBDN(String.valueOf(n));
        }
    }
    
    public static void soBDN(String s){
        Queue queue = new LinkedList<String>();
        queue.add("1");
        long dem = 0;
        while(!queue.isEmpty()){
            String k = (String) queue.peek();
            queue.poll();
            if(k.length() < s.length()){
                dem++;
                queue.add(k + "0");
                queue.add(k+ "1");
            }
            if(s.length() == k.length() && k.compareTo(s)<=0) dem++;
        }
        System.out.println(dem);
    }
    
}
