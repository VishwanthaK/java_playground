package com.vacker.example.algorithms.sort;

public class BubbleSort {


    public static void main(String[] args) {
        System.out.println("########################");
        System.out.println("##### BUBBLE SORT ######");
        System.out.println("########################");
        BubbleSort obj = new BubbleSort();
        int [] arr = {7, 4, 5, 2};
        display(arr);
        display(obj.bubbleSort(arr, arr.length));

    }

    public int[] bubbleSort(int[] arr, int arrLength) {
        int totalLoopingCount =  0;

        for (int i = 0; i< arrLength ; i++) {

            for (int j = 0; j < arrLength-i-1; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                totalLoopingCount++;
            }
            totalLoopingCount++;
        }
        System.out.println("Total looping count ::: "+totalLoopingCount);
        return arr;
    }


    public static void display(int [] arr) {
        for(int i = 0; i<= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
