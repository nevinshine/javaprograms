import java.util.Scanner;
class SumOfDiagonalElementsOfSquareMatrices
{
    public static void main(String args[]) 
    {
        Scanner inputScanner=new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int matrixSize=inputScanner.nextInt();
        int[][] matrix=new int[matrixSize][matrixSize];
        int diagonalSum=0;
        System.out.println("Enter the elements of the matrix:");
        for(int row=0;row<matrixSize;row++) 
        {
            for(int col=0;col<matrixSize;col++) 
            {
                matrix[row][col]=inputScanner.nextInt();
            }
        }
        for(int idx=0;idx<matrixSize;idx++) 
        {
            diagonalSum+=matrix[idx][idx];
            if(idx!=matrixSize-1-idx) 
            {
                diagonalSum+=matrix[idx][matrixSize-1-idx];
            }
        }
        System.out.println("Sum of diagonal elements: "+diagonalSum);
    }
}
