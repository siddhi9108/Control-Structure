package javaapplication2;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Switch_String {

    public static void main(String[] args) {
        String msg = "";

        System.out.println("Enter one ,two or three");
        Scanner ob = new Scanner(System.in);
        msg = ob.next();

        //System.out.println(x);
        switch (msg) {
            case "one":
                System.out.println("One");
                break;
            case "two":
                System.out.println("Two");
                break;
            case "three":
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong");
        }
    }
}
