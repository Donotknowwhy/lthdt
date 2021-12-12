/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.SapXepTheoMSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File myobj = new File("C://Users//BVCN 88//Desktop/input.txt");
        Scanner in = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        while(in.hasNext()){
            list.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(list);
        for(SinhVien sv:list){
            System.out.println(sv);
        }
    }
}
