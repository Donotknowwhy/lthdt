/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

/**
 *
 * @author huy
 */
import java.math.*;
import java.util.Scanner;

        
public class UCLN_SoNguyenLon {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            BigInteger a=in.nextBigInteger();
            BigInteger b=in.nextBigInteger();
            System.out.println(a.gcd(b));;
        }
    }
}
