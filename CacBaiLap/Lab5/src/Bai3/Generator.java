/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Random;

/**
 *
 * @author nauq2
 */
public class Generator implements Runnable{

    Thread t;
    Listener l;
    public Generator(Listener l)
    {
        this.l = l;
    }

    @Override
    public void run()
    {
        try{
            while(true){
                int number = new Random().nextInt(20)+1;
                System.out.println("Số sinh ngẫu nhiên: "+number);
                l.AddNumber(number);
                Thread.sleep(2000);
            }
        }catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }   
    }
    public void start()
    {
        if(t==null)
        {
            t = new Thread(this,"Generator");
            t.start();
        }
    }
}
