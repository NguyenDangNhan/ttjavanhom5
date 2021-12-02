/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public abstract class Employee {
    private String ten;
    private float luong;
    public abstract float TinhTien();
    public abstract void HienThi();

    public Employee() {
    }

    public Employee(String ten, float luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    public void nhap() {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập vào tên ");
        ten=nhap.nextLine();
        TinhTien();
    }
    public void display() {
        System.out.println("Tên :"+ten);
        HienThi();
    }
}
