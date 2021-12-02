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
public class Square implements Runnable, Listener{
    Thread t;
    int number;
    boolean flag = false;
    @Override
    public void run() {
        try{
            while(true)
            {
                if(this.flag){
                    System.out.println("Bình phương số vừa sinh: "+number*number);
                    this.flag=false;
                }
                Thread.sleep(1000);
            }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void AddNumber(int number) {
        this.number = number;
        flag = true;
    }
    public void start()
    {
        if(t==null)
        {
            t = new Thread(this,"Square");
            t.start();
        }
    }
    
}
