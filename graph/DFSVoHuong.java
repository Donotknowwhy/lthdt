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
public class DFSVoHuong {
    static List<Integer> a[] = new ArrayList[1003];
    static int dd[] = new int[1003];
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       while(t--> 0){
          int v = in.nextInt();
          int e = in.nextInt();
          int u = in.nextInt();
          for(int i = 1;i<=v;i++){
              a[i] = new ArrayList<>();
              dd[i] = 0;
          }
          
          for(int i =1; i<= e;i++){
              int x = in.nextInt();
              int y = in.nextInt();
              a[x].add(y);
              a[y].add(x);
          }
          dfs(u);
           System.out.println("");
       }
       }
    
    public static void dfs(int u){
        dd[u] = 1;
        System.out.print(u+" ");
        for(int i = 0; i< a[u].size();i++){
            if(dd[a[u].get(i)]==0){
                dfs(a[u].get(i));
            }
        }
    }
}
