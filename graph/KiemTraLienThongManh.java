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
public class KiemTraLienThongManh {
    static List<Integer> a[] = new ArrayList[1005];
    static boolean chuaxet[] = new boolean[1005];
    static int count = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            count = 0;
            int v = in.nextInt();
            int e = in.nextInt();
            for(int i = 1; i <= v;i++){
                a[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            
            for(int i = 1; i<=e;i++){
                int x = in.nextInt();
                int y = in.nextInt();
                a[x].add(y);
            }
            
            for(int i = 1;i<= v; i++){
               if(chuaxet[i]){
                   bfs(i);
                   count++;
               } 
            }
            
            if(count == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static void bfs(int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaxet[s] = false;
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(Integer k: a[x]){
                if(chuaxet[k]){
                    chuaxet[k] = false;
                    queue.add(k);
                }
            }
        }
    }
}
