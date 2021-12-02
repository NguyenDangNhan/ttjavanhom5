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
public class KhachVietNam extends KhachHang{
    private String loaiKH;
    private int dm;

    public KhachVietNam() {
    }

    public KhachVietNam(String loaiKH, int dm, String maKH, String htKH, int sl, double dg, double tt, Date ngayHD) {
        super(maKH, htKH, sl, dg, tt, ngayHD);
        this.loaiKH = loaiKH;
        this.dm = dm;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }
    
}
