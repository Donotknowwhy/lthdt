/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhamChuSo {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String min_a = a.replaceAll("6", "5");
        String min_b = b.replaceAll("6", "5");
        String max_a = a.replaceAll("5", "6");
        String max_b = b.replaceAll("5", "6");
        int min = Integer.parseInt(min_a) + Integer.parseInt(min_b);
        int max = Integer.parseInt(max_a) + Integer.parseInt(max_b);
        System.out.println(min + " " + max);
    } 
}
