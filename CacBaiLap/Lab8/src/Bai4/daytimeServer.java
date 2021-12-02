/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.net.*;
import java.io.*;
import java.util.Date;

/**
 *
 * @author nauq2
 */
public class daytimeServer {

    /**
     * @param args the command line arguments
     */
    public final static int daytimePort = 13;
    
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket theServerSocket;
        Socket theConnectionSocket;
        PrintWriter out;
        try {
            theServerSocket = new ServerSocket(daytimePort);
            System.out.println("TimeServer ready at port "+daytimePort);
            try {
                while (true) {
                    theConnectionSocket = theServerSocket.accept();
                    System.out.println("Request arrived!");
                    out = new PrintWriter(theConnectionSocket.getOutputStream(), true);
                    out.println(new Date());
                    theConnectionSocket.close();
                }
            }
            catch (IOException e) {
                theServerSocket.close();
                //InterruptedException(e);
            }
        }
        catch (IOException e) {
            //InterruptedException(e);
        }
    }
    
}
