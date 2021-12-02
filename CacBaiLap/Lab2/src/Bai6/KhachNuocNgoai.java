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
public class KhachNuocNgoai extends KhachHang{
    private String qt;

    public KhachNuocNgoai() {
    }

    public KhachNuocNgoai(String qt, String maKH, String htKH, int sl, double dg, double tt, Date ngayHD) {
        super(maKH, htKH, sl, dg, tt, ngayHD);
        this.qt = qt;
    }

    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt;
    }
    
}
