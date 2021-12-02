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
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        double a,b,c,min,max;
        System.out.println("Nhập vào lần lượt 3 số: ");
        System.out.println("Nhập vào số thứ nhất: ");
        a = nhap.nextDouble();
        System.out.println("Nhập vào số thứ hai: ");
        b = nhap.nextDouble();
        System.out.println("Nhập vào số thứ ba: ");
        c = nhap.nextDouble();
        max=a;
        min=a;
        if(max<b)
        {
            max=b;
        }
        if(max<c)
        {
            max=c;
        }
        if(min>b)
        {
            min=b;
        }
        if(min>c)
        {
            min=c;
        }
        System.out.println("Số lớn nhất là: "+max);
        System.out.println("Số nhỏ nhất là: "+min);
    }
    
}
