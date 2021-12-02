/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author nauq2
 */
public class CommissionWorker extends Employee{

    float luong;

    public CommissionWorker() {
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    @Override
    public float TinhTien() {
        return luong=new Boss().TinhTien()+new PieceWorker().TinhTien();
    }

    @Override
    public void HienThi() {
        System.out.println("Lương: "+luong);
    }
    
}
