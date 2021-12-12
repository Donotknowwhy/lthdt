/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.LietKeSVTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i = 1; i<=t;i++){
            list.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        int q = Integer.parseInt(in.nextLine());
        for(int i = 1;i<=q;i++){
            String lop = in.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+lop+":");
            for(SinhVien sv:list){
                if(sv.getLop().equals(lop)){
                    System.out.println(sv);
                }
            }
        }
        
    }
}
