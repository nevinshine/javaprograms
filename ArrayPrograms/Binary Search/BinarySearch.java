import java.util.Scanner;
class BinarySearch
{
    int[] arr;
    BinarySearch(int[] arr)
    {
        this.arr=arr;
    }
    void sortArray()
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    void printArray()
    {
        System.out.println("Sorted array:");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    int binarySearch(int key)
    {
        int low=0, high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        BinarySearch bs=new BinarySearch(arr);
        bs.sortArray();
        bs.printArray();
        System.out.print("Enter element to search: ");
        int key=sc.nextInt();
        int index=bs.binarySearch(key);
        if(index!=-1)
        {
            System.out.println("Element found at index "+index);
        }
        else
        {
            System.out.println("Element not found.");
        }
    }
}