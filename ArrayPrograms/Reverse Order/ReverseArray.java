import java.util.Scanner;
class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=scanner.nextInt();
        int[] numbers=new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++)
        {
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Reversed array:");
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(numbers[i]+" ");
        }   
    }
}
