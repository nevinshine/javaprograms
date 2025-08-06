import java.util.Scanner;
class SumOfTwoMatrices
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int numRows=scanner.nextInt();
        int numCols=scanner.nextInt();
        int[][] matrixA=new int[numRows][numCols];
        int[][] matrixB=new int[numRows][numCols];
        int[][] matrixSum=new int[numRows][numCols];

        System.out.println("Enter elements of first matrix:");
        for(int row=0;row<numRows;row++)
        {
            for(int col=0;col<numCols;col++)
            {
                matrixA[row][col]=scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for(int row=0;row<numRows;row++)
        {
            for(int col=0;col<numCols;col++)
            {
                matrixB[row][col]=scanner.nextInt();
            }
        }

        System.out.println("Sum of matrices:");
        for(int row=0;row<numRows;row++)
        {
            for(int col=0;col<numCols;col++)
            {
                matrixSum[row][col]=matrixA[row][col]+matrixB[row][col];
                System.out.print(matrixSum[row][col]+" ");
            }
            System.out.println();
        }
    }
}
