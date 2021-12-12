/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.DanhSachMatHang;

/**
 *
 * @author Admin
 */
public class MatHang implements Comparable<MatHang>{
   private String ten, donVi, ma;
   private int giaMua, giaBan;
   
    public MatHang() {
    }

    public MatHang(int id, String ten, String donVi, int giaMua, int giaBan) {
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.ma = "MH"+ String.format("%03d", id);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return ma + " "+ ten+" "+ donVi+" "+ giaMua+ " "+ giaBan+ " "+ (giaBan-giaMua);
    }

    @Override
    public int compareTo(MatHang o) {
       if(giaBan-giaMua == o.giaBan - o.giaMua) return ma.compareTo(ma);
       else return (o.giaBan - o.giaMua) - (giaBan-giaMua);
    }
  
   
}
