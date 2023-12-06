import java.util.Scanner;
public class Addtwomatrics {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows and colums of matrics:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] firstmatrix=new int[row][col];
        int[][] secondmatrix=new int[row][col];
        int[][] sumOfMatrices=new int[row][col];
        System.out.println("Enter elements of first matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                firstmatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter  elements of secod matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                secondmatrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sumOfMatrices[i][j]=firstmatrix[i][j]+secondmatrix[i][j];
            }
        }
        System.out.println("the sum of two matrices");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sumOfMatrices[i][j]+"\t");
               
            }
            System.out.println();
        }
    }
    
}
