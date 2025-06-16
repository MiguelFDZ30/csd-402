
//Miguel Fernandez
//Module 4
//6-15-2025
public class Calculator {

    // Make the calculation of a short array 3 elements
    public static short average(short[] array) {
        return (short)((array[0] + array[1] + array[2]) / 3);
    }

    // Make the calculation of an int array 4 elements
    public static int average(int[] array) {
        return (array[0] + array[1] + array[2] + array[3]) / 4;
    }

    // Make the calculation of a long array  2 elements
    public static long average(long[] array) {
        return (array[0] + array[1]) / 2;
    }

    // Make the calculation of a double array  3 elements
    public static double average(double[] array) {
        return (array[0] + array[1] + array[2]) / 3;
    }

    public static void main(String[] args) {
        //Print the methods
        System.out.println("Short " + average(new short[]{45, 35, 20}));
        System.out.println("Int " + average(new int[]{4, 15, 30, 45}));
        System.out.println("Long " + average(new long[]{300L, 200L}));
        System.out.println("Double " + average(new double[]{3.5, 8.5, 2.5}));
    }
}