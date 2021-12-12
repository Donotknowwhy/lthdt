/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.SapXepDSNV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma, ten, gioiTinh,  diaChi, mst;
    private Date ngaySinh, ngayKi;

    public NhanVien() {
    }

    public NhanVien(int id, String ten, String gioiTinh, String ngaySinh, String diaChi, String mst, String ngayKi) throws ParseException {
        this.ma = String.format("%05d", id);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
        this.mst = mst;
        this.ngayKi =  new SimpleDateFormat("dd/mm/yyyy").parse(ngayKi);
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

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    @Override
    public String toString() {
        return ma+" "+ ten+" "+gioiTinh+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh)+" "+diaChi+" "+mst+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngayKi);
    }

    @Override
    public int compareTo(NhanVien o) {
        return ngaySinh.compareTo(o.ngaySinh);
    }
    
    
    
}
