import java.util.Scanner;

public class Checker {

    public static void main(String[] args) {
        int[] inputArray = new int[5];
        System.out.println("Input Array Size is: " + inputArray.length);
        int newArrayLength = 8;
        inputArray = ResizeArray (inputArray, newArrayLength);
        System.out.println("New Array Size is: " + inputArray.length);
    }

    private static int[] ResizeArray (int[] inputArray, int newArrayLength) {
        inputArray = new int[newArrayLength];
        return inputArray;
    }

}
