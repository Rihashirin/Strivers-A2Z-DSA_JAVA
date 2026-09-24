import java.util.*;
public class Check_Palindrome
{
    public static boolean Palindrome(int n)
    {
        int reverse=0;
        int duplicate=n;
        while(n>0)
        {
            int lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
        }
        return reverse==duplicate;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digits: ");
        int n=sc.nextInt();
        if(Palindrome(n))
        {
            System.out.println("Panindrome");
        }
        else {
            System.out.println("Not Panlindrome");
        }

    }
}
