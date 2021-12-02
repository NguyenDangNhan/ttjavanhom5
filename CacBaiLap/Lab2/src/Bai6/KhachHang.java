/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Date;

/**
 *
 * @author nauq2
 */
public class KhachHang {
    private String maKH;
    private String htKH;
    private int sl;
    private double dg;
    private double tt;
    private Date ngayHD;

    public KhachHang() {
    }

    public KhachHang(String maKH, String htKH, int sl, double dg, double tt, Date ngayHD) {
        this.maKH = maKH;
        this.htKH = htKH;
        this.sl = sl;
        this.dg = dg;
        this.tt = tt;
        this.ngayHD = ngayHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHtKH() {
        return htKH;
    }

    public void setHtKH(String htKH) {
        this.htKH = htKH;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDg() {
        return dg;
    }

    public void setDg(double dg) {
        this.dg = dg;
    }

    public double getTt() {
        return tt;
    }

    public void setTt(double tt) {
        this.tt = tt;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }
    
}
