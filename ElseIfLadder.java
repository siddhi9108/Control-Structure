package javaapplication2;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class ElseIfLadder {

    public static void main(String[] args) {
        int x;
        String s1 = "";
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Char");
        s1 = ob.next();
        char ch = s1.charAt(0);
        x = ch;
        //System.out.println(x);
        if (x >= 65 && x <= 90) {

            System.out.println("Capital");

        } else if (x >= 97 && x <= 122) {

            System.out.println("Small");

        } else if (x >= 48 && x <= 57) {

            System.out.println("Digit");

        }
    }
}
