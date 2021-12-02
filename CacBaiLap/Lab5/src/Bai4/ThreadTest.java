/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Random;

/**
 *
 * @author nauq2
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static int[] mang = new int[1000];
    public static void Gan()
    {
        for(int i=0;i<mang.length;i++)
        {
            int rd = new Random().nextInt(1000);
            mang[i] = rd;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Gan();
        ThreadUtils tu1 = new ThreadUtils(0, 500, mang);
        Thread t1 = new Thread(tu1);
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException ex)
        {
        }
        long tong1 = tu1.getSum();
        ThreadUtils tu2 = new ThreadUtils(501, 999, mang);
        Thread t2 = new Thread(tu2);
        t2.start();
        try{
            t2.join();
        }catch(InterruptedException ex)
        {
        }
        long tong2 = tu2.getSum();
        System.out.println("Tổng 1 là: "+tong1);
        System.out.println("Tổng 2 là: "+tong2);
        System.out.println("Tổng 2 giá trị là: "+(tong1+tong2));
    }
    
}
