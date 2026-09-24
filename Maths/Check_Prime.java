import java.util.*;
public class Check_Prime {
    public static boolean prime(int n)
    {
        int count=0;
        for(int i=1;i*i<n;i++) {
            if (n % i == 0) {
                count++;
                if((n/i)!=i)
                {
                    count++;
                }
            }
        }
        if(count==2)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digits: ");
        int n=sc.nextInt();
        if(prime(n))
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
