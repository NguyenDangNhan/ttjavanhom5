/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }
    
    public void input()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào mã hàng hoá: ");
        maHH = nhap.nextLine();
        System.out.println("Nhập vào tên hàng hoá: ");
        tenHH = nhap.nextLine();
        System.out.println("Nhập vào số lượng hàng hoá: ");
        soLuong = nhap.nextFloat();
        System.out.println("Nhập vào giá của một hàng hoá: ");
        gia1SP = nhap.nextFloat();
    }
    
    public void display()
    {
        System.out.println("Mã hàng hoá: "+maHH);
        System.out.println("Tên hàng hoá: "+tenHH);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Giá một hàng hoá: "+gia1SP);
    }
}
