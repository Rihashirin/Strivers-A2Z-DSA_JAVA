import java.util.*;
public class Armstrong_numbers
{
    public static boolean armstrong(int n)
    {
        int sum=0;
        int duplicate=n;
        while(n>0)
        {
            int lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;
        }
        return sum ==duplicate;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digits: ");
        int n=sc.nextInt();
        if (armstrong(n))
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
