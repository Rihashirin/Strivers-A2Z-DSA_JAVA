import java.util.*;
public class Count_digits
{
    public static int countDigits(int n)
    {
        int count=0;
        while(n>0)
        {
            int lastDigit=n%10;
            count+=1;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digits: ");
        int n=sc.nextInt();
        System.out.println(countDigits(n));
    }
}
