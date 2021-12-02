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
public class GiangVienThinhGiang extends GiangVien{
    private String coQuanLamViec;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String coQuanLamViec, String ten, String email, String diachi, String dienthoai, float tongluong, int sogiogiang) {
        super(ten, email, diachi, dienthoai, tongluong, sogiogiang);
        this.coQuanLamViec = coQuanLamViec;
    }

    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }

    public void setCoQuanLamViec(String coQuanLamViec) {
        this.coQuanLamViec = coQuanLamViec;
    }
    
    @Override
    public GiangVien Nhap() {
        super.input();
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhập vào cơ quan làm việc :");
        coQuanLamViec=nhap.nextLine();
        return this;
    }

    @Override
    public void Xuat() {
        super.display();
        System.out.println("Cơ quan làm việc:"+coQuanLamViec);
    }

    @Override
    public void TinhLuong() {
        float luong;
        luong=this.getSogiogiang()*200000;
        this.setTongluong(luong);
    }
    
}
