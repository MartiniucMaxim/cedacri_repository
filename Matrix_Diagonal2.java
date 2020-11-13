import java.util.Scanner;
import java.lang.Math;
public class Matrix_Diagonal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input row:");
        int row = input.nextInt();
        System.out.print("Input column:");
        int column = input.nextInt();
        String[][] array = new String[row][column];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double random = Math.random() * 10;
                int rand_int = (int) random;
                array[i][j] = Integer.toString(rand_int);
                System.out.println("Index[" + i + "][" + j + "]:" + array[i][j]);
            }
        }
        System.out.println("\nCurrent matrix:\n");
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
                System.out.print(array[i][j] + " ");
            }

        }

        int i=0;
        for(int j= array.length-1;j>=0;j--)
        {
            System.out.println(array[i][j] + " ");
            int k=i;
            int m=j;
            while(k<row-1 && m< column-1)
            {
                k++;
                m++;
                System.out.println("Value Matrix["+ k +"]["+m+"]:"+array[k][m]);
            }
        }

    }
}
