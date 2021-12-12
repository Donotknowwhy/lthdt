/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class DuongDiDFSVoHuong {
    static List<Integer> ke[] = new ArrayList[1005];
    static boolean chuaxet[] = new boolean[1005];
    static int truoc[] = new int[1005];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int t = in.nextInt();
            for(int i =0; i<=n;i++){
                chuaxet[i] = true;
                ke[i] = new ArrayList<>();
            }
            for(int i =1;i<=m;i++){
                int u = in.nextInt();
                int v = in.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            dfs(s);
            if(chuaxet[t]) System.out.println(-1);
            else{
                Stack<Integer> stack = new Stack<>();
                stack.push(t);
                while(stack.peek() != s){
                    int x = stack.peek();
                    stack.push(truoc[x]);
                }
                while(!stack.empty()){
                    System.out.print(stack.peek()+" ");
                    stack.pop();
                }
                System.out.println("");
            }
        }
    }
    
    public static void dfs(int s){
        chuaxet[s] = false;
        for(Integer v: ke[s]){
            if(chuaxet[v]){
                truoc[v] = s;
                dfs(v);
            }
        }
    }
}
