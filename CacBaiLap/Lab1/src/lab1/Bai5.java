/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class Bai5 {
    Scanner nhap = new Scanner(System.in);
    int n,chon,kt=0;
    public void Nhap()
    {
        System.out.println("Nhập vào n: ");
        n = nhap.nextInt();
        kt++;
    }
    public float Tong2(int n)
    {
        if(n==1)
            return 1;
        else
            return (float)1/n + Tong2(n-1);
    }
    public float GT(int n)
    {
        if(n==1)
            return 1;
        else
            return n*GT(n-1);
    }
    public float Tong3(int n)
    {
        Bai5 bai5 = new Bai5();
        if(n==1)
            return 1;
        else
            return (float)1/bai5.GT(n) + Tong3(n-1);
    }
    public void Menu()
    {
        
        System.out.println("====Menu====");
        System.out.println("1.Nhập vào số nguyên dương n.");
        System.out.println("2.Tính tổng: 1 + 1/2 + 1/3 + ... + 1/n");
        System.out.println("3.Tính tổng: 1 + 1/2! + 1/3! + 1/4! + ... + 1/n!");
        System.out.println("4.Thoát");
        System.out.println("Nhập vào lựa chọn");
        chon = nhap.nextInt();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai5 bai5 = new Bai5();
        while(bai5.kt==0&&bai5.chon!=4)
        {
            bai5.Menu();
            switch(bai5.chon)
            {
                case 1: bai5.Nhap();
                break;
                case 4: System.out.println("Thoát chương trình");
                break;
                default: System.out.println("Chương trình chưa nhập vào một số n");
                    System.out.println("Vui lòng chọn lại chương trình");
                break;
            }
        }
        while(bai5.chon!=4)
        {
            bai5.Menu();
            switch(bai5.chon)
            {
                case 1: bai5.Nhap();
                break;
                case 2: System.out.println("Kết quả với n="+bai5.n+" là: "+bai5.Tong2(bai5.n));
                break;
                case 3: System.out.println("Kết quả với n="+bai5.n+" là: "+bai5.Tong3(bai5.n));
            }   
        }
    }
    
}
