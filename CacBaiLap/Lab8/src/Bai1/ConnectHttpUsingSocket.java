/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author nauq2
 */
public class ConnectHttpUsingSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Socket socket=new Socket("localhost", 80);
        OutputStream os = socket.getOutputStream();
        PrintWriter out=new PrintWriter(os,true);
        out.println("GET / HTTP/1.0");
        out.println();
        out.flush();
        InputStream is = socket.getInputStream();
        int len=0;
        byte []buffer=new byte[4086];
        while((len=is.read(buffer))!=-1)
        {
            String data=new String(buffer,0,len);
            System.out.println(data);
        }
        socket.close();
    }
    
}
