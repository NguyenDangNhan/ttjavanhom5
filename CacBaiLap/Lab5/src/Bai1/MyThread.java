/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author nauq2
 */
public class MyThread extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread th = new MyThread();
        th.start();
        System.out.println("Đây là Main Thread");
    }
    
    public void run()
    {
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
