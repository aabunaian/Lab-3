import java.io.*;
import java.util.Arrays;
public class Sorter {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 43,4,354,64,2,67,3 };
        insertionSort(intArray);
        System.out.println(Arrays.toString(intArray));

        int[] myArray = {4, 2 ,1 ,6 ,8};
        selectionSort(myArray);
        System.out.print(Arrays.toString(myArray));

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
        } public static void selectionSort (int[] list){
        for (int i = 0; i < list.length; i++){
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}








    

