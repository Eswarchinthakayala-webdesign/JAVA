package com.Eswar;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array={3,1,5,4,2};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void bubbleSort(int[] array) {
        for(int i=0;i<array.length;i++)
        {
            for(int j=1;j< array.length-i;j++)
            {
                if(array[j-1]>array[j])
                {
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                System.out.println(Arrays.toString(array));
            }
            System.out.println(Arrays.toString(array));
        }

    }
}
