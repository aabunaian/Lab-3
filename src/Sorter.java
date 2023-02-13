import java.io.*;
import java.util.Arrays;
public class Sorter {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 43,4,354,64,2,67,3 };
        insertionSort(intArray);
        System.out.println(Arrays.toString(intArray));

    }

        public static void insertionSort(int array[]) {
            int n = array.length;
            for (int j = 1; j < n; j++) {
                int key = array[j];
                int i = j-1;
                while ( (i > -1) && ( array [i] > key ) ) {
                    array [i+1] = array [i];
                    i--;
                }
                array[i+1] = key;
            }
        }
    }
