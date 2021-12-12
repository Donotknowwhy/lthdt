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
public class XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            sinh(s);
            
            
        }
    }
    public static void sinh(String s){
        int i=s.length()-1;
        while(s.charAt(i)=='1'&&i>0){
            i--;
        }
        String result = "";
        if(i>0){
            result=s.substring(0,i);
            result = result + "1";
            for (int j = i; j < s.length() - 1; j++) {
                result += "0";
            }
        }
        else{
            for (int j = 0; j < s.length(); j++) {
                result += "0";
            }
        }
        System.out.println(result);
    }
}
