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
public class GiangVienCoHuu extends GiangVien{

    private float luongthoathuan;
    private int sogioquydinh=40;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(float luongthoathuan, int sogioquydinh, String ten, String email, String diachi, String dienthoai, float tongluong, int sogiogiang) {
        super(ten, email, diachi, dienthoai, tongluong, sogiogiang);
        this.luongthoathuan = luongthoathuan;
        this.sogioquydinh = sogioquydinh;
    }
    
    @Override
    public GiangVien Nhap() {
        Scanner nhap = new Scanner(System.in);
        super.input();
        System.out.print("Nhập lương thoả thuận: ");
        luongthoathuan = nhap.nextFloat();
        return this;
    }

    @Override
    public void Xuat() {
        super.display();
        System.out.println("luong thoa thuan :"+luongthoathuan);
        System.out.println("so gio quy dinh :"+sogioquydinh);
    }

    @Override
    public void TinhLuong() {
        float luong;
        luong=luongthoathuan+(this.getSogiogiang()-sogioquydinh)*200000;
        this.setTongluong(luong);
    }
    
}
