package org.horizoncolumbus.hs;

public class Swap {

    public static void main(String[] args) {
	// write your code here

        int x = 9;
        int y = 5;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);


        int arr[] = new int[]{3, 2};

        System.out.println("{" + arr[0] + ", " + arr[1] + "}");

        int temp1 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp1;

        System.out.println("{" + arr[0] + ", " + arr[1] + "}");
    }
}
