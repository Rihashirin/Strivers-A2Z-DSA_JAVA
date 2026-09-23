import java.util.*;
public class Reverse_Number
{
    public static int Reverse(int n)
    {
        int ReverseNum=0;
        while(n>0)
        {
            int last_digit=n%10;
            n=n/10;
            ReverseNum=(ReverseNum*10)+last_digit;
        }
        return ReverseNum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digits: ");
        int n=sc.nextInt();
        System.out.println(Reverse(n));
    }
}
