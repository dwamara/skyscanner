package com.dwitech.eap.skyscanner.adaptor.control;

import javax.ejb.Stateless;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

@Stateless
public class IPAddressFinder {
    public String getIPAddress() {
        URL url;
        BufferedReader in;
        String ipAddress;
        try {
            url = new URL("http://bot.whatismyipaddress.com");
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            ipAddress = in.readLine().trim();
            /* IF not connected to internet, then
             * the above code will return one empty
             * String, we can check it's length and
             * if length is not greater than zero,
             * then we can go for LAN IP or Local IP
             * or PRIVATE IP
             */
            if (!(ipAddress.length() > 0)) {
                ipAddress = getLocalIP();
            }
        } catch (Exception ex) { // This try will give the Private IP of the Host.
            ipAddress = getLocalIP();
        }
        System.out.println("IP Address: " + ipAddress);
        return ipAddress;
    }
    private String getLocalIP() {
        String ipAddress;
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println((ip.getHostAddress()).trim());
            ipAddress = (ip.getHostAddress()).trim();
        } catch(Exception exp) {
            ipAddress = "ERROR";
        }
        return ipAddress;
    }
}
