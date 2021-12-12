/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class BieuDienDoThiCoHuong {
    static List<Integer> a[] = new ArrayList[1005]; 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int v = in.nextInt();
            int e = in.nextInt();
            
            for(int i =1; i<=v;i++){
                a[i]= new ArrayList<>();
            }
            
            for(int i =1; i<=e;i++){
                int x = in.nextInt(); 
                int y = in.nextInt();
                a[x].add(y);
            }
            
            for(int i =1 ;i<=v;i++){
                System.out.print(i+": ");
                Collections.sort(a[i]);
                for(Integer k: a[i]){
                    System.out.print(k+" ");
                }
                System.out.println("");
            }
        }
    }
}
