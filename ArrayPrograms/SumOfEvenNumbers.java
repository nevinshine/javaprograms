import java.util.*;
class SumOfEvenNos
{
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int num=sc1.nextInt();
        int[] sumarr=new int[num];
        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++)
        {
            sumarr[i]=sc1.nextInt();
        }
        int sum=0;
        for (inti=0;i<sumarr.length;i++)
        {
            if (sumarr[i]%2==0) {
                sum += sumarr[i];
            }
        }
        System.out.println("Sum of even elements: "+sum);
    }
}
