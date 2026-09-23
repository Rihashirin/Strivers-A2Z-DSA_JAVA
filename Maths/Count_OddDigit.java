import java.util.*;
public class Count_oddDigits
{
    public static int Count_odd(int n)
    {
        int count=0;
        while(n>0)
        {
            int lastdigit=n%10;
            if((lastdigit%2)!=0)
            {
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digits: ");
        int n=sc.nextInt();
        System.out.println(Count_odd(n));
    }
}
