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
public class RutgonXau {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s =in.nextLine();
        boolean check=true;
        while(check){
            check=false;
            String ans="";
            for(int i=0;i<s.length();i++){
                if((i+1<s.length())&& s.charAt(i)==s.charAt(i+1)){
                    check=true;
                    for(int j=i+2;j<s.length();j++){
                        ans+=s.charAt(j);
                    }
                    s=ans;
                    break;
                }else{
                    ans+=s.charAt(i);
                }
            }
            s=ans;
        }
        if (s.equals("")) {
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }
}
