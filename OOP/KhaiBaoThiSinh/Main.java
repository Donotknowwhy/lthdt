/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.KhaiBaoThiSinh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       ThiSinh ts = new ThiSinh(in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
        System.out.println(ts);
    }
}
