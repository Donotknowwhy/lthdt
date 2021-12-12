/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, gioiTinh,diaChi;
    private Date ngaySinh;
    private String tenFormat;

    public KhachHang() {
    }

    public KhachHang(int id, String ten, String gioiTinh, String diaChi, String ngaySinh) throws ParseException {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.ma = "KH"+ String.format("%03d", id);
        StringTokenizer stk = new StringTokenizer(this.ten, " ");
        while(stk.hasMoreTokens()){
            String s = stk.nextToken();
            s= s.toLowerCase();
            for(int i = 0; i<s.length();i++){
                if(i ==0){
                    tenFormat+= String.valueOf(s.charAt(i)).toUpperCase();
                }else{
                    tenFormat+= s.charAt(i);
                }
            }
            tenFormat+= " ";
        }
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return ma+" "+ ten+" "+ gioiTinh+ " "+diaChi+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh);
    }

    @Override
    public int compareTo(KhachHang o) {
        return ngaySinh.compareTo(ngaySinh);
    }
    
    
}
