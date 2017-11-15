import java.util.Scanner;

public class Checker {



    public static void main(String[] args) {
        System.out.println("Input Array:");
        int[] array  = ArrayInput(5);
        PrintArray(array);
        System.out.println("Sorted Array:");
        int[] sortedArray = SortArray(array);
        PrintArray(sortedArray);
    }

    public static int[] ArrayInput (int size) {
        int[] arrayInput = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arrayInput[i] = scanner.nextInt();
        }
        return arrayInput;
    }

    public static void PrintArray (int[] arrayToPrint) {
        for (int i : arrayToPrint) {
            System.out.println(i);
        }
    }

    public static int[] SortArray (int[] arrayToSort) {

        int temp = 0;

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i+1]) {
                temp = arrayToSort[i+1];
                arrayToSort[i+1] = arrayToSort[i];
                arrayToSort[i] = temp;
            }
        }

        return arrayToSort;
    }
}
