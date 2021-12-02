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
public class Car extends Engine{
    private int soghe;
    private String tocdo;

    public Car() {
    }

    public Car(int soghe, String tocdo, String mamay, String tenmay, String tennhasx, int namsx, double gia) {
        super(mamay, tenmay, tennhasx, namsx, gia);
        this.soghe = soghe;
        this.tocdo = tocdo;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public String getTocdo() {
        return tocdo;
    }

    public void setTocdo(String tocdo) {
        this.tocdo = tocdo;
    }
    
    @Override
    public void input()
    {
        super.input();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số ghế: ");
        soghe=nhap.nextInt();
        System.out.print("Nhập vào tốc độ: ");
        nhap.nextLine();
        tocdo = nhap.nextLine();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Số ghế: "+soghe);
        System.out.println("Tốc độ: "+tocdo);
    }
}
