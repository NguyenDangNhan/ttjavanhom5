/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public abstract class GiangVien {
    private String ten;
    private String email;
    private String diachi;
    private String dienthoai;
    private float tongluong;
    private int sogiogiang;

    public GiangVien() {
    }

    public GiangVien(String ten, String email, String diachi, String dienthoai, float tongluong, int sogiogiang) {
        this.ten = ten;
        this.email = email;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.tongluong = tongluong;
        this.sogiogiang = sogiogiang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public float getTongluong() {
        return tongluong;
    }

    public void setTongluong(float tongluong) {
        this.tongluong = tongluong;
    }

    public int getSogiogiang() {
        return sogiogiang;
    }

    public void setSogiogiang(int sogiogiang) {
        this.sogiogiang = sogiogiang;
    }
    
    public abstract GiangVien Nhap();
    public abstract void Xuat();
    public abstract void TinhLuong();
    public void input()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào họ tên: ");
        ten = nhap.nextLine();
        System.out.print("Nhập vào email: ");
        email = nhap.nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        diachi = nhap.nextLine();
        System.out.print("Nhập vào điện thoại: ");
        dienthoai = nhap.nextLine();
        System.out.print("Nhập vào tổng lương: ");
        tongluong = nhap.nextFloat();
        System.out.print("Nhập vào số giờ giảng dạy: ");
        sogiogiang = nhap.nextInt();
    }
    public void display()
    {
        System.out.println("Họ tên: "+ten);
        System.out.println("Email: "+email);
        System.out.println("Địa chỉ: "+diachi);
        System.out.println("Điện thoại: "+dienthoai);
        System.out.println("Tổng lương: "+tongluong);
        System.out.println("Số giờ giảng dạy: "+sogiogiang);
    }
}
