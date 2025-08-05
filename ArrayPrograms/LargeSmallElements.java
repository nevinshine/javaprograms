import java.util.*;
class LargeSmallElements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter "+num+" elements:");
        for (int i=0;i<num;i++) 
        {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
        for (int i=1;i<num;i++)
        {
            if (arr[i]<smallest)
            {
                smallest = arr[i];
            }
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Smallest element: "+smallest);
        System.out.println("Largest element: "+largest);
    }
}
