package org.horizoncolumbus.hs;

public class Average {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[]{3, 66, 3, 6, 8, 2, 7};
        int average = 0;

        for(int i = 0; i < arr.length; i++){
            average += arr[i];
        }
        average /= arr.length;

        System.out.println("Average: " + average);
    }
}
