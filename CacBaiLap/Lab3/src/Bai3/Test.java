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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] ds=new Employee[3];
        System.out.println("Nhập thông tin Boss");
        ds[0]=new Boss();
        ds[0].nhap();
        System.out.println("Nhập Thông tin PieceWorker ");
        ds[1]=new PieceWorker();
        ds[1].nhap();
        System.out.println("Nhập Thông tin CommissionWorker ");
        ds[2]=new CommissionWorker();
        ds[2].nhap();
        System.out.println("Thông tin Boss");
        ds[0].display();
        System.out.println("Thông tin PieceWorker");
        ds[1].display();
        System.out.println("Thông tin CommissionWorker");
        ds[2].display();
    }
    
}
