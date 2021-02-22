package org.horizoncolumbus.hs;

public class Sort {

    public static void main(String[] args) {
        // write your code here

        int[] unsortedArray = new int[]{5, 7, 0, 1, 2, 3, 8, 3, 6, 4};

        System.out.print("Unsorted Array: ");
        for(int i = 0; i < unsortedArray.length; i++){
            System.out.print(unsortedArray[i] + " ");
        }

        System.out.println();

        System.out.print("Sorted Array: ");
        for(int i = 0; i < unsortedArray.length - 1; i++){
            for(int j = 0; j < unsortedArray.length - i - 1; j++){
                if(unsortedArray[j] > unsortedArray[j+1]){
                    int temp = unsortedArray[j+1];
                    unsortedArray[j+1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }

        for(int i = 0; i < unsortedArray.length; i++){
            System.out.print(unsortedArray[i] + " ");
        }


    }
}
