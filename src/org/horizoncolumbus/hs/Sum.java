package org.horizoncolumbus.hs;

public class Sum {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[]{3, 66, 3, 6, 8, 2, 7};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
