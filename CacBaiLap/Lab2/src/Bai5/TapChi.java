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
public class TapChi extends TaiLieu{
    private int soph;
    private int thangph;

    public TapChi() {
    }

    public TapChi(int soph, int thangph, String matl, String tennxb, int sobanph) {
        super(matl, tennxb, sobanph);
        this.soph = soph;
        this.thangph = thangph;
    }

    public int getSoph() {
        return soph;
    }

    public void setSoph(int soph) {
        this.soph = soph;
    }

    public int getThangph() {
        return thangph;
    }

    public void setThangph(int thangph) {
        this.thangph = thangph;
    }
    
}
