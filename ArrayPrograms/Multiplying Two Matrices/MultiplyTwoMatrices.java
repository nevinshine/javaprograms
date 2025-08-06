import java.util.Scanner;
class MultiplyTwoMatrices
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter rows and columns of first matrix: ");
        int rows1=scanner.nextInt();
        int cols1=scanner.nextInt();
        System.out.print("Enter rows and columns of second matrix: ");
        int rows2=scanner.nextInt();
        int cols2=scanner.nextInt();
        if(cols1!=rows2)
        {
            System.out.println("Matrix multiplication not possible!");
            return;
        }
        int[][] matrix1=new int[rows1][cols1];
        int[][] matrix2=new int[rows2][cols2];
        int[][] product=new int[rows1][cols2];
        System.out.println("Enter first matrix:");
        for(int i=0;i<rows1;i++)
            for(int j=0;j<cols1;j++)
            matrix1[i][j]=scanner.nextInt();

        System.out.println("Enter second matrix:");
        for(int i=0;i<rows2;i++)
            for(int j=0;j<cols2;j++)
            matrix2[i][j]=scanner.nextInt();
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                for(int k=0;k<cols1;k++)
                {
                    product[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("Product of matrices:");
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<cols2;j++)
            {
            System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}