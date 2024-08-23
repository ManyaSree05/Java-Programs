public class factorial{
    public static void main(String[] args){
        int x = 6,fact = 1,i;
        for(i=x;i>0;i--)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+ x + " is "+ fact);
    }
}
