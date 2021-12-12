/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

import java.util.Scanner;

/**
 *
 * @author huy
 */
public class SoDep {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            String s=in.nextLine();
            if(tn(s)&&chan(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean tn(String s) {
        int n=s.length();
        boolean check=true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                check=false;
                break;
            }
        }    
        if(check==false) return false;
        else return true;
    }
    public static boolean chan(String s){
        boolean check=true;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2!=0){
                check=false;
                break;
            }
        }
        if(check==false) return false;
        else return true;
    }
}
