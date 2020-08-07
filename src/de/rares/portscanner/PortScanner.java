package de.rares.portscanner;

import java.util.Scanner;

public class PortScanner {

    public static int beg_port;
    public static int end_port;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Beg-Port:");
        beg_port = Integer.parseInt(in.nextLine());
        System.out.println("End-Port:");
        end_port = Integer.parseInt(in.nextLine());
    }


    public static boolean test(int port){
        return true;
    }

}
