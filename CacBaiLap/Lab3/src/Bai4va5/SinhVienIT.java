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
public class SinhVienIT extends SinhVienPoly{
    private double diemjava;
    private double diemhtml;
    private double diemcss;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemjava, double diemhtml, double diemcss, String hoten, String nganh) {
        super(hoten, nganh);
        this.diemjava = diemjava;
        this.diemhtml = diemhtml;
        this.diemcss = diemcss;
    }
    
    @Override
    public double getDiem() {
        return (2*diemjava+diemhtml+diemcss)/4;
    }
    @Override
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        super.Nhap();
        boolean error = true;
        do
        {
            try
            {
                System.out.print("Nhập vào điểm Java: ");
                diemjava = nhap.nextDouble();
                error = false;
            }catch(Exception e)
            {
                System.out.println("Nhập sai dữ liệu. ");
            }
        }while(error==true);
        System.out.print("Nhập vào điểm HTML: ");
        diemhtml = nhap.nextDouble();
        System.out.print("Nhập vào điểm CSS: ");
        diemcss = nhap.nextDouble();
    }
    @Override
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Nhập vào điểm Java: "+diemjava);
        System.out.println("Nhập vào điểm HTML: "+diemhtml);
        System.out.println("Nhập vào điểm CSS: "+diemcss);
    }
}
