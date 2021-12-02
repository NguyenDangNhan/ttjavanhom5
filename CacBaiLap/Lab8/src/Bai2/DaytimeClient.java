/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.io.*;
import java.net.*;

/**
 *
 * @author nauq2
 */
public class DaytimeClient {

    /**
     * @param args the command line arguments
     */
    static final int defaultPort = 13;
    public static void main(String[] args) {
        // TODO code application logic here
        int portNumber;
        Socket ClientSocket;
        BufferedReader timeStream;
        String hostName;
        switch(args.length) 
        {
            case 1: hostName = args[0];
                    portNumber = defaultPort;
                break;
            case 2: hostName = args[0];
                    portNumber = new Integer(args[1]).intValue();
                break;
            default:
                    hostName = "localhost";
                    portNumber = defaultPort;
        }
        try
        {
            ClientSocket = new Socket(hostName,portNumber);
            timeStream = new BufferedReader(new
            InputStreamReader(ClientSocket.getInputStream()));
            String timeString = timeStream.readLine();
            System.out.println("It is " + timeString + " at " + hostName);
            timeStream.close();
            ClientSocket.close();
        }catch(UnknownHostException e)
        {
            //InterruptedException(" Unknown host error");
        }
        catch (ConnectException e)
        {
            System.out.println(" Service unavailable on port "+portNumber+" of host "+hostName);
        }
        catch (IOException e)
        {
            //InterruptedException(" Communication error occured\r\n "+e);
        }
    }
    
}
