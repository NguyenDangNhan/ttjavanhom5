/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class Engine {
    private String mamay;
    private String tenmay;
    private String tennhasx;
    private int namsx;
    private double gia;

    public Engine() {
    }

    public Engine(String mamay, String tenmay, String tennhasx, int namsx, double gia) {
        this.mamay = mamay;
        this.tenmay = tenmay;
        this.tennhasx = tennhasx;
        this.namsx = namsx;
        this.gia = gia;
    }

    public String getMamay() {
        return mamay;
    }

    public void setMamay(String mamay) {
        this.mamay = mamay;
    }

    public String getTenmay() {
        return tenmay;
    }

    public void setTenmay(String tenmay) {
        this.tenmay = tenmay;
    }

    public String getTennhasx() {
        return tennhasx;
    }

    public void setTennhasx(String tennhasx) {
        this.tennhasx = tennhasx;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public void input()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào mã máy: ");
        mamay = nhap.nextLine();
        System.out.print("Nhập vào tên máy: ");
        tenmay = nhap.nextLine();
        System.out.print("Nhập vào tên nhà sản xuất: ");
        tennhasx = nhap.nextLine();
        System.out.print("Nhập vào năm sản xuất: ");
        namsx = nhap.nextInt();
        System.out.print("Nhập vào giá máy: ");
        gia = nhap.nextDouble();
    }
    
    public void display()
    {
        System.out.println("Mã máy: "+mamay);
        System.out.println("Tên máy: "+tenmay);
        System.out.println("Tên nhà sản xuất: "+tennhasx);
        System.out.println("Năm sản xuất: "+namsx);
        System.out.println("Giá máy: "+gia);
    }
}
