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
public abstract class SinhVienPoly {
    private String hoten;
    private String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc()
    {
        String hl="Nhập sai điểm";
        if(getDiem()>=0&&getDiem()<5)
            hl="Yếu";
        else if(getDiem()>=5&&getDiem()<=7)
            hl="Trung bình";
        else if(getDiem()>7&&getDiem()<8)
            hl="Khá";
        else if(getDiem()>=8&&getDiem()<=10)
            hl="Giỏi";
        return hl;
    }
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên: ");
        hoten = nhap.nextLine();
        System.out.print("Nhập ngành học: ");
        nganh = nhap.nextLine();
    }
    public void Xuat()
    {
        System.out.println("Họ tên sinh viên: "+hoten);
        System.out.println("Ngành học: "+nganh);
        System.out.println("Học lực: "+getHocLuc());
        System.out.println("Điểm trung bình: "+getDiem());
    }
}
