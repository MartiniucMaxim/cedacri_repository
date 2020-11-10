import java.util.Scanner;
import java.lang.Math;

public class Matrix_Snake2 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input amount of row:");
        int row = input.nextInt();
        System.out.print("Input amount of column:");
        int column = input.nextInt();

        String[][] array = new String[row][column];
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
                double random = Math.random() * 10;
                int rand_integer = (int)random;
                array[i][j] = Integer.toString(rand_integer);
                System.out.print("\nArray["+i+"]["+j+"]:"+array[i][j]);
            }
        }


        System.out.println("Output current array:");
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nOutput snake matrix through column passing");
        for(int j=0;j< array.length;j++)
        {
            if(j%2==0)
            for(int i= array.length-1;i>=0;i--)
            {
                System.out.print(array[i][j] + " ");
            }
            else
                for(int i=0;i< array.length;i++)
                {
                 System.out.print(array[i][j] + " ");
                }
                System.out.println();
        }
    }

}
