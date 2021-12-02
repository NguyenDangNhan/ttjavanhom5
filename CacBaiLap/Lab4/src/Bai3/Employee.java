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
public class Employee {
    private String manv;
    private String tennv;
    private String chucvu;
    private double luong;
    private double tglamviec;

    public Employee() {
    }

    public Employee(String manv, String tennv, String chucvu, double luong, double tglamviec) {
        this.manv = manv;
        this.tennv = tennv;
        this.chucvu = chucvu;
        this.luong = luong;
        this.tglamviec = tglamviec;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getTglamviec() {
        return tglamviec;
    }

    public void setTglamviec(double tglamviec) {
        this.tglamviec = tglamviec;
    }
    
    public void nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        manv = nhap.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        tennv = nhap.nextLine();
        System.out.print("Nhập chức vụ nhân viên: ");
        chucvu = nhap.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        luong = nhap.nextDouble();
        System.out.print("Nhập thời gian nhân viên đã làm việc: ");
        tglamviec = nhap.nextDouble();
    }
    
    public void xuat()
    {
        System.out.println("Mã nhân viên: "+manv);
        System.out.println("Tên nhân viên: "+tennv);
        System.out.println("Chức vụ nhân viên: "+chucvu);
        System.out.println("Lương nhân viên: "+luong);
        System.out.println("Thời gian nhân viên đã làm việc: "+tglamviec);
    }
}
