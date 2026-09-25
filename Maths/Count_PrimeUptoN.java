// 1.tuf approach
class Solution {
    public boolean Check_prime(int n) 
    {

        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if((n%i)==0)
            {
                return false;
            }
        }
        return true;
    }
    public int primeUptoN(int n)
    {
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(Check_prime(i))
            {
                count++;
            }
        }
        return count;
    }
}



//2. my solutio dry run
import java.util.*;
public class Count_PrimeToN
{
    public static boolean check_prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int count_prime(int n)
    {
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(check_prime(i))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n=sc.nextInt();
        int result= (count_prime(n));
        System.out.println(result);
    }
}
