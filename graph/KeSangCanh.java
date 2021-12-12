/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class KeSangCanh {
    static List<Integer>[] a = new ArrayList[1003];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for( int i =1 ;i <= t;i++){
            a[i] = new ArrayList<>();
            String s = in.nextLine();
            StringTokenizer stk = new StringTokenizer(s," ");
            while(stk.hasMoreTokens()){
               int k = Integer.parseInt(stk.nextToken());
               if(i< k){
                   a[i].add(k);
               }
            }
        }
        for(int i =1;i<= t;i++){
            if(a[i].size()>0){
                for( int j =0;j< a[i].size();j++){
                System.out.println(i+ " "+ a[i].get(j));
            }
            }
        }
    }
}
