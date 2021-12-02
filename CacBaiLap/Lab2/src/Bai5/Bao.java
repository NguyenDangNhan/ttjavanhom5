/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Date;

/**
 *
 * @author nauq2
 */
public class Bao extends TaiLieu{
    private Date ngayph;

    public Bao() {
    }

    public Bao(Date ngayph, String matl, String tennxb, int sobanph) {
        super(matl, tennxb, sobanph);
        this.ngayph = ngayph;
    }

    public Date getNgayph() {
        return ngayph;
    }

    public void setNgayph(Date ngayph) {
        this.ngayph = ngayph;
    }
    
}
