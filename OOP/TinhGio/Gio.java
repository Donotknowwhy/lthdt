/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.TinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Gio implements Comparable<Gio>{
    private String ma, ten;
    private Date gioV, gioR;

    public Gio() {
    }

    public Gio(String ma, String ten, String gioV, String gioR) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.gioV = new SimpleDateFormat("hh:mm").parse(gioV);
        this.gioR = new SimpleDateFormat("hh:mm").parse(gioR);
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

    public Date getGioV() {
        return gioV;
    }

    public void setGioV(Date gioV) {
        this.gioV = gioV;
    }

    public Date getGioR() {
        return gioR;
    }

    public void setGioR(Date gioR) {
        this.gioR = gioR;
    }
    
    private String calculate(){
        long tDiff = gioR.getTime() - gioV.getTime();
        tDiff /= 1000;
        int h = (int) tDiff/3600;
        int m = (int) ((tDiff%3600)/60);
        return h + " gio " + m + " phut ";
    }

    @Override
    public String toString() {
        return ma + " "+ ten+" "+ calculate();
    }

    @Override
    public int compareTo(Gio o) {
        return (int) ((o.gioR.getTime()- o.gioV.getTime()) - (gioR.getTime()- gioV.getTime()));
    }
       
    
}
