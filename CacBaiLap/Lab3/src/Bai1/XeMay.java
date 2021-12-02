/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class XeMay implements IXe{
    private String bienso;
    private String loaixe;
    private String mauxe;
    private float giatien;

    public XeMay() {
    }

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }
    
    @Override
    public void Nhap() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào biển số xe: ");
        bienso = nhap.nextLine();
        System.out.print("Nhập vào loại xe: ");
        loaixe = nhap.nextLine();
        System.out.print("Nhập vào màu xe: ");
        mauxe = nhap.nextLine();
        System.out.print("Nhập vào giá tiền: ");
        giatien = nhap.nextFloat();
    }

    @Override
    public void HienThi() {
        System.out.println("Biển số xe: "+bienso);
        System.out.println("Loại xe: "+loaixe);
        System.out.println("Màu xe: "+mauxe);
        System.out.println("Giá tiền: "+giatien);
    }
    
}
