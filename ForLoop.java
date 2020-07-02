package javaapplication2;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a, b, i;
        System.out.println("Enter number....");
        a = ob.nextInt();
        i = 1;
        for (i = 1; i <= 10; i++) {
            b = a * i;
            System.out.println(b);

        }

    }

}
