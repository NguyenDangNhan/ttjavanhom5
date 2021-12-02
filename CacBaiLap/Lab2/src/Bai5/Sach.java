/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author nauq2
 */
public class Sach extends TaiLieu{
    private String tentg;
    private String tensach;
    private int sotrang;

    public Sach() {
    }

    public Sach(String tentg, String tensach, int sotrang, String matl, String tennxb, int sobanph) {
        super(matl, tennxb, sobanph);
        this.tentg = tentg;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    
}
