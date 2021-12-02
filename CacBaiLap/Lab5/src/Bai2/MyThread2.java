/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import static java.lang.Thread.sleep;

/**
 *
 * @author nauq2
 */
public class MyThread2 implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread2 myRunnable = new MyThread2();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("Đây là Main Thread");
    }

    @Override
    public void run() {
        while (true) {            
            try{
                System.out.println("Đây là Thread con");
                sleep(1000);
            }catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    
}
