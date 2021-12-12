/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.SapXepSinhVien;

/**
 *
 * @author Admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv, ten,lop, email;

    public SinhVien() {
    }

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return msv+ " "+ ten+" "+ lop+" "+ email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if( lop.equals(o.lop)) return msv.compareTo(o.msv);
        else return lop.compareTo(o.lop);
    }
    
    
    
}
