import java.util.Scanner;
import java.lang.Math;

public class Matrix_Diagonal {
          public static void main(String[]args)
          {
              Scanner input = new Scanner(System.in);
              System.out.print("Input row:");
              int row = input.nextInt();
              System.out.print("Input column:");
              int column = input.nextInt();
              String[][] array = new String[row][column];


              for(int i=0;i< array.length;i++)
              {
                  for(int j=0;j< array.length;j++)
                  {
                      double random = Math.random() * 10;
                      int rand_int = (int) random;
                      array[i][j] = Integer.toString(rand_int);
                      System.out.println("Index["+i+"]["+j+"]:"+array[i][j]);
                  }
              }
              System.out.println("\nCurrent matrix:\n");
              for(int i=0;i< array.length;i++)
              {
                  for(int j=0;j< array.length;j++)
                  {
                      System.out.print(array[i][j] + " ");
                  }
                  System.out.println();
              }

              System.out.println("\nMatrix with Diagonal:\n");

              for(int k=0;k< array.length;k++)
              {
                 int sum = k;
                 for(int i=0;i< array.length;i++)
                     for (int j=0;j< array.length;j++)
                         if(i+j==sum)
                             System.out.println("Index["+i+"]["+j+"]:"+array[i][j]);
              }
              for(int k=1;k< array.length;k++)
              {
                  int sum = array.length-1+k;
                  for(int i=0;i< array.length;i++)
                      for(int j=0;j<array.length;j++)
                          if(i+j==sum)
                              System.out.println("Index["+i+"]["+j+"]:"+array[i][j]);
              }

          }
}
