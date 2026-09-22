import java.util.*;
public class SecSmallest
{
    public static int SecondSmall(int n,int[] arr)
    {
        int Smallest=arr[0];
        int secSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<Smallest){
                secSmallest=Smallest;
                Smallest=arr[i];
            }
            else if(arr[i]!=Smallest && arr[i]<secSmallest)
            {
                secSmallest=arr[i];
            }
        }
        System.out.println(Smallest);
        return secSmallest;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(SecondSmall(n,arr));
    }
}
