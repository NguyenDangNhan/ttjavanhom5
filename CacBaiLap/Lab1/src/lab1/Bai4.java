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
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        float n;
        System.out.println("Nhập vào sô điện tiêu thụ: ");
        n = nhap.nextFloat();
        if(n<=50)
        {
            System.out.println("Tiền điện: "+5000*n);
        }
        else
        {
            System.out.println("Tiền điện: "+50*5000+(n-50)*6200);
        }
    }
    
}
