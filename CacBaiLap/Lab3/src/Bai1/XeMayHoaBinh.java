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
public class XeMayHoaBinh extends XeMay{
    private int n;
    XeMay[] xe;

    public XeMayHoaBinh() {
    }

    public XeMayHoaBinh(String bienso, String loaixe, String mauxe, float giatien,int n, XeMay[] xe) {
        super(bienso, loaixe, mauxe, giatien);
        this.n = n;
        this.xe = xe;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public XeMay[] getXe() {
        return xe;
    }

    public void setXe(XeMay[] xe) {
        this.xe = xe;
    }
    
    @Override
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số lượng xe máy ở Hoà Bình: ");
        n = nhap.nextInt();
        xe = new XeMay[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập vào thông tin xe máy ở Hoà Bình thứ "+(i+1));
            xe[i]=new XeMay();
            xe[i].Nhap();
        }
    }
    @Override
    public void HienThi()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Thông tin xe máy thứ "+(i+1));
            xe[i].HienThi();
        }
    }
}
