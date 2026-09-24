import java.util.*;
public class Perfect_Number
{
    public static boolean perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum==n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digits: ");
        int n=sc.nextInt();
        if (perfect(n))
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not perfect number");
        }
    }
}
