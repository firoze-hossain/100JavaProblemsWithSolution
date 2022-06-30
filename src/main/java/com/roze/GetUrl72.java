package com.roze;

import java.net.URL;

/**
 *
 * @author firoze
 * How to get URL of site using java Programs
 */
public class GetUrl72 {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://firoze.vercel.app/resume");
            System.out.println("Protocol = " + url.getProtocol());
            System.out.println("Hostname = " + url.getHost());
            System.out.println("Port Number = " + url.getPort());
            System.out.println("File name = " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
