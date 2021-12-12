/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.DanhSachSinhVien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ten, lop, msv;
    private Date ngaySinh;
    private float diem;
    private String tenFormat;
    public SinhVien() {
    }

    public SinhVien(int id, String ten, String lop, String ngaySinh, float diem) throws ParseException {
        this.lop = lop;
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.diem = diem;
        this.msv = "B20DCCN"+ String.format("%03d", id);
        StringTokenizer stk = new StringTokenizer(this.ten, " ");
        tenFormat = "";
        while(stk.hasMoreTokens()){
            String s = stk.nextToken();
            s= s.toLowerCase();
            for(int i = 0 ; i<s.length();i++){
                if( i == 0 ){
                    tenFormat += String.valueOf(s.charAt(i)).toUpperCase();
                }else tenFormat += s.charAt(i);
            }
            tenFormat += " ";
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return msv +" "+ tenFormat+ " "+ lop+" "+ new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)+" "+ String.format("%.2f", diem);
    }
    
    
    
}
