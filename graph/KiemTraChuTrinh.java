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
public class KiemTraChuTrinh {
    static List<Integer> list[] = new ArrayList[1005];
    static boolean chuTrinh = false;
    static int truoc[] = new int[1003];
    static boolean chuaXet[] = new boolean[1005];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            chuTrinh = false;
            int v = in.nextInt();
            int e = in.nextInt();
            for(int i=1; i<=v;i++){
               list[i] = new ArrayList<>();
               chuaXet[i] = true;
            }
            
            for(int i =1; i<= e;i++){
                int x = in.nextInt();
                int y = in.nextInt();
                list[x].add(y);
                list[y].add(x);
            }
            
            for(int i =1; i <= v;i++){
                if(chuaXet[i]){
                    if(bfs(i)){
                        chuTrinh = true;
                        break;
                    }
                }
            }
            if(chuTrinh) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean bfs(int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaXet[s] = false;
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(Integer k: list[x]){
                if(chuaXet[k]){
                    chuaXet[k] = false;
                    truoc[k] = x;
                    queue.add(k);
                } else if (k!= truoc[x]) return true;
            }
        }
        return false;
    }
}
