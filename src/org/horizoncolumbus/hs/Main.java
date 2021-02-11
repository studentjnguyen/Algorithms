package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a = new int[]{5, 7, 0, 1, 2, 3, 8, 9, 6, 4};

        int largest = a[0];

        for(int i = 0; i < a.length; i++){
            if (a[i] > largest){
                largest = a[i];
            }
        }

        System.out.println(largest);
    }
}
