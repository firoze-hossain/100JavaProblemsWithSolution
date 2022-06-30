package com.roze;

import java.net.InetAddress;
import java.net.URL;

/**
 *
 * @author firoze
 * How to get IP address from site URL using java program
 */
public class IpAddress73 {

    public static void main(String[] args) {
        try {
            String s = "https://firoze.vercel.app/";
            InetAddress ip = InetAddress.getByName(new URL(s).getHost());
            System.out.println("Host Name = " + ip.getHostName());
            System.out.println("IP Address = " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
