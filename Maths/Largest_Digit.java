import java.util.*;
public class Largest_Digit
{
    public static int largest(int n)
    {
        int largest=0;
        while(n>0){
            int digit=n%10;
            if(digit>largest)
            {
                largest=digit;
            }
            n=n/10;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter digits: ");
        int n=sc.nextInt();
        System.out.println(largest(n));
    }
}
