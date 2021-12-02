/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4va5;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class SinhVienBiz extends SinhVienPoly{
    private double diemmark;
    private double diemsales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemmark, double diemsales, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemmark = diemmark;
        this.diemsales = diemsales;
    }

    public double getDiemmark() {
        return diemmark;
    }

    public void setDiemmark(double diemmark) {
        this.diemmark = diemmark;
    }

    public double getDiemsales() {
        return diemsales;
    }

    public void setDiemsales(double diemsales) {
        this.diemsales = diemsales;
    }
    
    @Override
    public double getDiem() {
       return (diemmark*2+diemsales)/3;
    }
    
    @Override
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập vào điểm Marketing: ");
        diemmark = nhap.nextDouble();
        System.out.print("Nhập vào điểm Sales: ");
        diemsales = nhap.nextDouble();
    }
    
    @Override
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Nhập vào điểm Marketing: "+diemmark);
        System.out.println("Nhập vào điểm Sales: "+diemsales);
    }
}
