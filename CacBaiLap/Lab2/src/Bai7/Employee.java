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
public class Employee extends Person {
    private double hesoLuong;

    public Employee(double hesoLuong, String ht, String dc) {
        super(ht, dc);
        this.hesoLuong = hesoLuong;
    }

    public Employee() {
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    public double tinhluong()
    {
      return 30*hesoLuong;  
    }
    public String danhgia()
    {
      return "Tốt";
    }
    @Override
    public String toString()
    {
        return ("Họ tên: "+getHt()+", Địa chỉ: "+getDc()+", Hệ số lương: "+hesoLuong+", Lương: "+tinhluong()+"danh gia: "+danhgia());
    }
}
