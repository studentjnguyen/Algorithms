package org.horizoncolumbus.hs;


public class CountingMatches {

    static int countOccurrences(int[] arr, int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
                res++;
        return res;
    }

    public static void main(String[] args) {
	// write your code here

        int[] arr = {3, 6, 3, 7, 8, 3, 7};
        int max = arr[0];
        int n = arr.length;
        int i;
        for(i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int x = 0; x <= max; x++){
            if(countOccurrences(arr, n, x) != 0) {
                System.out.println(countOccurrences(arr, n, x));
            }
        }
    }
}
