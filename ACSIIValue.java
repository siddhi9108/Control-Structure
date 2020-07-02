package javaapplication2;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class ASCIIValue {

    public static void main(String[] args) {
        int x;
        String s1 = "";
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Char");
        s1 = ob.next();
        char ch = s1.charAt(0);
        x = ch;
        System.out.println(x);
        //if (x % 2 == 0) {
        //System.out.println("Even");
        //} else {
        // System.out.println("Odd");
        //}
    }
}
