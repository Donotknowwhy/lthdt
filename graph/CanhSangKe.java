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
public class CanhSangKe {
    static List<Integer>[] ke = new ArrayList[1005];
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       while(t-->0){
           int e = in.nextInt();
           int v = in.nextInt();
           for(int i = 1; i<=e;i++){
               ke[i] = new ArrayList<>();
           }
           for(int i = 1; i<= v;i++){
               int a = in.nextInt();
               int b = in.nextInt();
               ke[a].add(b);
               ke[b].add(a);
           }
           
           for( int i = 1; i<= e; i++ ){
               System.out.print(i+": ");
               for(int j =0; j< ke[i].size();j++){
                   System.out.print(ke[i].get(j)+ " ");
               }
               System.out.println("");
           }
       }
    }
}
