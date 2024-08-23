public class palindrome{
    public static void main(String[] args)
    {
        int x = 343,sum = 0,r;
        int temp = x;
        while(x>0){
            r = x % 10;
            sum = sum*10+r;
            x = x/10;
        }
        if(temp == sum)
        {
            System.out.println("Is Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
