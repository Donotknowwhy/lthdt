/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author huy
 */
public class ChuanHoaTen {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            String s=in.nextLine();
            System.out.println(chuanhoa(s));
        }
    }
    public static String chuanhoa(String s){
        StringTokenizer st=new StringTokenizer(s, " ");
        StringBuilder kq=new StringBuilder();
        while(st.hasMoreTokens()){
            String tmp=st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i=1;i<tmp.length();i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
