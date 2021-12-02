/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;
import jdk.nashorn.internal.ir.Symbol;

/**
 *
 * @author nauq2
 */
public class PieceWorker extends Employee{

    float sl;
    float luong;

    public PieceWorker() {
    }

    public float getSl() {
        return sl;
    }

    public void setSl(float sl) {
        this.sl = sl;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    @Override
    public float TinhTien() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sản phẩm: ");
        sl = nhap.nextFloat();
        return luong = (float)(sl*0.5);
    }

    @Override
    public void HienThi() {
        System.out.println("Lương: "+luong);
    }
    
}
