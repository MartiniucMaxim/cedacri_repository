import java.util.Scanner;
import java.lang.Math;

public class Matrix_1 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input row:");
        int r = input.nextInt();   //analogy for arr[i]
        System.out.print("Input collumn");
        int c = input.nextInt(); //analogy for arr[c]

        String[][] array = new String[r][c]; //Initialize Array with 2d-matrix with size row x collumn
        //Make cycle for row,begin with zero index, then each element compare do arr.length and pass through iteration until we done
          for(int i=0;i<array.length;i++)
          {
              //Then to column, the process the same.
              for(int j=0;j<array.length;j++)
              {
                  //In body cycle set the instruction, where declare random elements of array with bound 1-10
                  double random = Math.random() * 10;
                  int integer_rand =(int) random;
                  array[i][j] = Integer.toString(integer_rand); //
                  System.out.print("\nArray["+i+"]["+j+"]:"+array[i][j]);
              }
          }
          System.out.println("\nOutput current array...");
          for(int i=0;i<array.length;i++)
          {
              for (int j=0;j<array.length;j++)
              {
                  System.out.print(array[i][j] + " ");
              }
              System.out.println();
          }


          System.out.println("\nOutput the new array...");

           for(int j=0;j<array.length;j++)
           {
               for(int i=0;i<array.length;i++)
               {
                   System.out.print(array[i][j] + " ");
               }
               System.out.println();
           }


    }
}
