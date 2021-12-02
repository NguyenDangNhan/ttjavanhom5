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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        int a;
        double b;
        char c;
        String d;
        System.out.println("Nhap vao mot so nguyen: ");
        a = nhap.nextInt();
        System.out.println("Nhap vao mot so thuc: ");
        b = nhap.nextDouble();
        System.out.println("Nhap vao mot ki tu: ");
        nhap.nextLine();
        c = nhap.nextLine().charAt(0);
        System.out.println("Nhap vao mot chuoi: ");
        d = nhap.nextLine();
        System.out.println("Dữ liệu vừa nhập: ");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
    
}
