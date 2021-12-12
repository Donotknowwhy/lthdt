/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author huy
 */
public class BCNN_SoNguyenLon {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            BigInteger a=in.nextBigInteger();
            BigInteger b=in.nextBigInteger();
            BigInteger x=a.gcd(b);
            BigInteger bcnn=a.multiply(b).divide(x);
            System.out.println(bcnn);
        }
    }
}
