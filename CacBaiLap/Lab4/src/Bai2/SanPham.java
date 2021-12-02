/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author nauq2
 */
public class SanPham {
    private String ten;
    private double gia;
    
    public SanPham() {
    }

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào tên sản phẩm: ");
        ten = nhap.nextLine();
        System.out.print("Nhập giá của sản phẩm: ");
        gia = nhap.nextDouble();
    }
    
    public void Xuat()
    {
        System.out.println("Tên sản phẩm: "+ten);
        System.out.println("Giá sản phẩm: "+gia);
    }
}
