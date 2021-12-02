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
public class StudentUneti implements Imark{

    private String id;
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String quequan;

    public StudentUneti() {
    }

    public StudentUneti(String id, String ten, String gioitinh, String ngaysinh, String quequan) {
        this.id = id;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    
    @Override
    public void input() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập Id: ");
        id = nhap.nextLine();
        System.out.print("Nhập tên: ");
        ten = nhap.nextLine();
        System.out.print("Nhập giới tính: ");
        gioitinh = nhap.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaysinh = nhap.nextLine();
        System.out.print("Nhập quê quán: ");
        quequan = nhap.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Id: "+id);
        System.out.println("Tên: "+ten);
        System.out.println("Giới tính: "+gioitinh);
        System.out.println("Ngày sinh: "+ngaysinh);
        System.out.println("Quê quán: "+quequan);
    }
    
}
