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
public class Mobile extends Engine{
    String nuocsx;

    public Mobile() {
    }

    public Mobile(String nuocsx, String mamay, String tenmay, String tennhasx, int namsx, double gia) {
        super(mamay, tenmay, tennhasx, namsx, gia);
        this.nuocsx = nuocsx;
    }

    public String getNuocsx() {
        return nuocsx;
    }

    public void setNuocsx(String nuocsx) {
        this.nuocsx = nuocsx;
    }
    @Override
    public void input()
    {
        super.input();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào nước sản xuất: ");
        nuocsx = nhap.nextLine();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Nước sản xuất: "+nuocsx);
    } 
}
