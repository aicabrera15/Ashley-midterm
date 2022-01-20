package algorithm;


import java.util.Arrays;


public class UnitTestSorting {

    public static void main(String[] args) {
        Sort sortArgo = new Sort();
        //apply unsorted array to selectionSort.
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        int[] array = new int[0];
        System.out.println("This is the unSorted Array: " + Arrays.toString(array));

        sortArgo.selectionSort(array);
        System.out.println("This is the integer array sorted with selectionSort: " + Arrays.toString(array));

        sortArgo.insertionSort(array);
        System.out.println("This is the integer array sorted with insertionSort: " + Arrays.toString(array));

        sortArgo.bubbleSort(array);
        System.out.println("This is the integer array sorted with bubbleSort: " + Arrays.toString(array));

        sortArgo.mergeSort(array, 0, array.length - 1);
        System.out.println("This is the integer array sorted with mergeSort: " + Arrays.toString(array));

        sortArgo.quickSort(array, 0, array.length - 1);
        System.out.println("This is the integer array sorted with quickSort: " + Arrays.toString(array));

        sortArgo.heapSort(array);
        System.out.println("This is the integer array sorted with heapSort: " + Arrays.toString(array));

        sortArgo.bucketSort(array, 10);
        System.out.println("This is the integer array sorted with bucketSort: " + Arrays.toString(array));

        sortArgo.shellSort(array, array.length);
        System.out.println("This is the integer array sorted with shellSort: " + Arrays.toString(array));


        System.out.println("After Selection Sort");

        for(int i:sortedArray){

            System.out.print(i+" ");

        }

    }

        }
