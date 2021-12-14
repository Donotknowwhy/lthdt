/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.LietKeSVTheoNganh;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String msv, hoTen, lop, email;
    private Nganh nganh;

    public SinhVien() {
    }

    public SinhVien(String msv, String hoTen, String lop, String email) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
         if(msv.contains("DCKT")) nganh =  Nganh.DCKT;
        if(msv.contains("DCCN") && lop.charAt(0)!='E') nganh =  Nganh.DCCN;
        if(msv.contains("DCAT") && lop.charAt(0)!='E') nganh =  Nganh.DCAT;
        if(msv.contains("DCVT")) nganh = Nganh.DCVT;
        if(msv.contains("DCDT")) nganh =  Nganh.DCDT;
    }

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }
    
    
    
    @Override
    public String toString() {
        return msv+" "+ hoTen+" "+ lop+" "+ email;
    }
    
    enum Nganh{
        DCKT("Ke toan"),
        DCCN("Cong nghe thong tin"),
        DCAT("An toan thong tin"),
        DCVT("Vien thong"),
        DCDT("Dien tu"),
        ;
        private String ten;

        Nganh(String ten) {
            this.ten = ten;
        }
        
         public String getTen() {
            return ten;
        }

    }
}
