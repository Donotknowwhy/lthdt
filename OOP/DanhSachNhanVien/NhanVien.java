/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.DanhSachNhanVien;

/**
 *
 * @author Admin
 */
public class NhanVien {
   private String ma,hoTen,gioiTinh,diaChi,mst,ngaySinh, ngayKy;

    public NhanVien() {
    }

    public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String mst, String ngayKy) {
        this.ma = String.format("%05d", id);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.mst = mst;
        this.ngaySinh = ngaySinh;
        this.ngayKy = ngayKy;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgayKy() {
        return ngayKy;
    }

    public void setNgayKy(String ngayKy) {
        this.ngayKy = ngayKy;
    }

    
    @Override
    public String toString() {
        return ma+ " "+ hoTen +" "+ gioiTinh+ " "+ ngaySinh +" "+ diaChi+" "+ mst + " "+ ngayKy;
    }
   
   
}
