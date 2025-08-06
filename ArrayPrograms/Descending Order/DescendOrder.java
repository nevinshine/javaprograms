import java.util.Scanner;
class DescendOrder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter "+num+" elements: ");
        for(int i=0;i<num;i++) 
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=0;j<num-1-i;j++)
            {
                if(arr[j]<arr[j+1]) 
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array in descending order: ");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}