/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.PhanSo;

import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class PhanSo {
   private long a, b;
    public PhanSo(String nextLine) {
        StringTokenizer stk = new StringTokenizer(nextLine," ");
        a = Long.parseLong(stk.nextToken());
        b = Long.parseLong(stk.nextToken());
    }

    public PhanSo(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public PhanSo cong(PhanSo p) {
        long mau = Math.abs(b)*Math.abs(p.b)/ucln(b,p.b);
        long tu = a*(mau/Math.abs(b))+p.a*(mau/Math.abs(p.b));
        return new PhanSo(tu,mau).rutGon();
    }

    public PhanSo nhan(PhanSo p) {
        boolean dau = (p.a* p.b*a*b>0);
        if(dau)
        return new PhanSo(Math.abs(a*p.a),Math.abs(b*p.b)).rutGon();
        else return new PhanSo((-1)*Math.abs(a*p.a),Math.abs(b*p.b)).rutGon();
    }
    public PhanSo rutGon(){
        boolean dau = (a*b>0);
        long ucln = ucln(Math.abs(a),Math.abs(b));
        long mau = b/ucln;
        long tu = a/ucln;
        if(dau== true) {
            return new PhanSo(tu, mau);
        }
        return new PhanSo((-1)*tu,mau);
    }
    public long ucln(long a,long b){
        if(b == 0)  return a;
        else return ucln(b,a%b);
    }

    @Override
    public String toString() {
        PhanSo ps = this.rutGon();
        return ps.a+"/"+ps.b;
    } 
 
}
