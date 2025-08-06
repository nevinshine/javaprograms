import java.util.*;
class FlipLastRCWithFirstRC
{
    int[][] arr;
    Scanner sc;
    FlipLastRCWithFirstRC()
    {
        sc=new Scanner(System.in);
    }
    void inputArray()
    {
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols=sc.nextInt();
        arr=new int[rows][cols];
        System.out.println("Enter array elements:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void flipFirstAndLastRow()
    {
        int cols=arr[0].length;
        int lastRow=arr.length-1;
        for(int j=0;j<cols;j++)
        {
            int temp=arr[0][j];
            arr[0][j]=arr[lastRow][j];
            arr[lastRow][j]=temp;
        }
    }
    void flipFirstAndLastCol()
    {
        int rows=arr.length;
        int lastCol=arr[0].length-1;
        for(int i=0;i<rows;i++)
        {
            int temp=arr[i][0];
            arr[i][0]=arr[i][lastCol];
            arr[i][lastCol]=temp;
        }
    }
    void printArray()
    {
        for(int[] row:arr)
        {
            for(int val:row)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        FlipLastRCWithFirstRC obj=new FlipLastRCWithFirstRC();
        obj.inputArray();
        obj.flipFirstAndLastRow();
        obj.flipFirstAndLastCol();
        System.out.println("Array after flipping:");
        obj.printArray();
    }
}