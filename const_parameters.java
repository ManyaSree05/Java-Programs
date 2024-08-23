public class const_parameters{
int x;
public const_parameters(int y)
{
    x = y;
}
public static void main(String[] args)
{
    const_parameters myobj = new const_parameters(10);
    System.out.println(myobj.x);
}
}