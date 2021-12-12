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
public class UocSoNT_Max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            long x=in.nextLong();
            for(long i=2;i<Math.sqrt(x);i++){
                if(i*i==x){
                    x/=i; break;
                }
                while(x%i==0)x/=i;
            }
            System.out.println(x);
        }
    }
}
