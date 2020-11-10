import java.lang.Math;
import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the row:");
        int row = input.nextInt();
        System.out.print("Input the column:");
        int column = input.nextInt();

        String[][] array = new String[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double random = Math.random() * 10;
                int rand_int = (int) random;
                array[i][j] = Integer.toString(rand_int);
                System.out.println("Array[" + i + "][" + j + "]:" + array[i][j]);
            }
        }

        System.out.println("Output current array:\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral matrix:\n");
        int p = row;
        int j = 0;

        for (int i = p - 1; i > 0; i--, j++) {
            for (int num = j; num < i; num++)
                System.out.println("Value Matrix[" + j + "][" + num + "]:" + array[j][num]);

            for (int num = j; num < i; num++)
                System.out.println("Value Matrix[" + num + "][" + i + "]:" + array[num][i]);

            for (int num = i; num > j; num--)
                System.out.println("Value Matrix[" + i + "][" + num + "]:" + array[i][num]);

            for (int num = i; num > j; num--)
                System.out.println("Value Matrix[" + num + "][" + j + "]:" + array[num][j]);
        }
        int m = (p - 1) / 2;
        if (p % 2 == 1)
            System.out.println("Value Matrix[" + m + "][" + m + "]:" + array[m][m]);




    }
}