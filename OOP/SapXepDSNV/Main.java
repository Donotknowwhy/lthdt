/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.SapXepDSNV;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws ParseException {
       Scanner in = new Scanner(System.in);
       int t = Integer.parseInt(in.nextLine());
       List<NhanVien> list = new ArrayList<>();
       for(int i = 1; i<=t;i++){
           list.add(new NhanVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
       }
        Collections.sort(list);
       for(NhanVien nv:list){
           System.out.println(nv);
       }
    }
 
}
