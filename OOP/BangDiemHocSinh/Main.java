/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.BangDiemHocSinh;

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
         Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        List<BangDiem> list = new ArrayList<>();
        for (int i = 1; i <= test; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            float diemTb = 0.0F;
            diemTb += sc.nextFloat()*2;
            diemTb += sc.nextFloat()*2;
            for (int j = 1; j <= 8; j++)
                diemTb += sc.nextFloat();
            list.add(new BangDiem(i, name, diemTb));
        }
        Collections.sort(list);
        for (BangDiem hs : list)
            System.out.println(hs);

    }
}
