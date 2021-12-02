/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class Product {
    public String tenhanghoa;
    public String nhasanxuat;
    public double giaban;

    public Product() {
    }

    public Product(String tenhanghoa, String nhasanxuat, double giaban) {
        this.tenhanghoa = tenhanghoa;
        this.nhasanxuat = nhasanxuat;
        this.giaban = giaban;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
    
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào tên hàng hoá: ");
        tenhanghoa = nhap.nextLine();
        System.out.println("Nhập vào nhà sản xuất: ");
        nhasanxuat = nhap.nextLine();
        System.out.println("Nhập vào giá bán: ");
        giaban = nhap.nextDouble();
    }
    
    public void Xuat()
    {
        System.out.println("Tên hàng hoá: "+tenhanghoa);
        System.out.println("Nhà sản xuất: "+nhasanxuat);
        System.out.println("Giá bán: "+giaban);
    }
}
