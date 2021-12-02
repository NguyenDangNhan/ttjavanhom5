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
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        int a,b,c,d;
        do{
            System.out.println("Nhập hệ số a khác 0: ");
            a = nhap.nextInt();
        }while(a==0);
        System.out.println("Nhập hệ số b:");
        b= nhap.nextInt();
        System.out.println("Nhập hệ số c:");
        c= nhap.nextInt();
        d = b*b - 4*a*c;
        if(d<0)
        {
            System.out.println("Phương trình vô nghiệm!");
        }
        else if(d==0)
        {
            System.out.println("Phương trình có nghiệm duy nhất x="+(float)-b/2*a);
        }
        else
        {
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1="+(float)(-b-Math.sqrt(d))/2*a);
            System.out.println("x2="+(float)(-b+Math.sqrt(d))/2*a);
        }
    }
    
}
