/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class TaiLieu {
    private String matl;
    private String tennxb;
    private int sobanph;

    public TaiLieu() {
    }

    public TaiLieu(String matl, String tennxb, int sobanph) {
        this.matl = matl;
        this.tennxb = tennxb;
        this.sobanph = sobanph;
    }

    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public int getSobanph() {
        return sobanph;
    }

    public void setSobanph(int sobanph) {
        this.sobanph = sobanph;
    }
    
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào mã tài liệu: ");
        matl = nhap.nextLine();
        System.out.print("Nhập vào tên nhà xuất bản: ");
        tennxb = nhap.nextLine();
        System.out.print("Nhập vào số bản phát hành: ");
        sobanph = nhap.nextInt();
    }
    public void Xuat()
    {
        System.out.print("Nhập vào mã tài liệu: "+matl);
        System.out.print("Nhập vào tên nhà xuất bản: "+tennxb);
        System.out.print("Nhập vào số bản phát hành: "+sobanph);
    }
}
