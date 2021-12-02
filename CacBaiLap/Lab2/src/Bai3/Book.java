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
public class Book {
    private String tensach;
    private String tacgia;
    private String nhaxuatban;
    private int namxuatban;
    private float gia;

    public Book() {
    }

    public Book(String tensach, String tacgia, String nhaxuatban, int namxuatban, float gia) {
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
        this.gia = gia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    
    public void input()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào tên sách: ");
        tensach = nhap.nextLine();
        System.out.println("Nhập vào tên tác giả: ");
        tacgia = nhap.nextLine();
        System.out.println("Nhập vào nhà xuất bản: ");
        nhaxuatban = nhap.nextLine();
        System.out.println("Nhập vào năm xuất bản: ");
        namxuatban = nhap.nextInt();
        System.out.println("Nhập vào giá sách: ");
        gia = nhap.nextFloat();
    }
    
    public void display()
    {
        System.out.println("Tên sách: "+tensach);
        System.out.println("Tên tác giả: "+tacgia);
        System.out.println("Nhà xuất bản: "+nhaxuatban);
        System.out.println("Năm xuất bản: "+namxuatban);
        System.out.println("Giá: : "+gia);
    }
}
