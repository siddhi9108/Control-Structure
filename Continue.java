package javaapplication2;

public class Continue {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 6};
        for (int x : arr) {
            if (x == 3) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("After");

    }

}
