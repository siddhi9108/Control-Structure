package javaapplication2;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        int x;

        System.out.println("Enter 1,2 or 3");
        Scanner ob = new Scanner(System.in);
        x = ob.nextInt();

        //System.out.println(x);
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong");
        }
    }
}
