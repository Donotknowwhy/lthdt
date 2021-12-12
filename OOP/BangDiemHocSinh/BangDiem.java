/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.BangDiemHocSinh;

import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class BangDiem implements Comparable<BangDiem>{
    private String name;
    private float diemTb;
    private String xepLoai;
    private String stt;

    public BangDiem(int id, String name, float diemTb1) {
        this.name = name;
        diemTb1/=12;
        this.diemTb = (float) Math.round(diemTb1*10)/10;
        this.stt = "HS"+String.format("%02d", id);
        if (diemTb >= 9) {
            xepLoai = "XUAT SAC";
        } else if (diemTb >= 8) {
            xepLoai = "GIOI";
        } else if (diemTb >= 7) {
            xepLoai = "KHA";
        } else if (diemTb >= 5) {
            xepLoai = "TB";
        } else {
            xepLoai = "YEU";
        }
    }

    @Override
    public int compareTo(BangDiem o) {
         if(diemTb == o.diemTb){
             return stt.compareTo(o.stt);
         }else{
             if(diemTb > o.diemTb)  return -1;
             else return 1;
         }
    }

    @Override
    public String toString() {
        return stt+" "+name+" "+diemTb+" "+xepLoai;
    }

    
    
}
