/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author nauq2
 */
public class Customer extends Person{
    private String tencty;
    private double gthd;

    public Customer() {
    }

    public Customer(String tencty, double gthd, String ht, String dc) {
        super(ht, dc);
        this.tencty = tencty;
        this.gthd = gthd;
    }

    public String getTencty() {
        return tencty;
    }

    public void setTencty(String tencty) {
        this.tencty = tencty;
    }

    public double getGthd() {
        return gthd;
    }

    public void setGthd(double gthd) {
        this.gthd = gthd;
    }
    
    @Override
    public String toString()
    {
        return ("Họ tên: "+getHt()+", Địa chỉ: "+getDc()+", Tên công ty: "+tencty+", Giá trị hoá đơn: "+gthd);
    }
}
