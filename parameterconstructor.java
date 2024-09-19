public class parameterconstructor{
int a;
public parameterconstructor(int b)
{
    a = b;
}
public static void main(String[] args)
{
    parameterconstructor myobj = new parameterconstructor(5);
    System.out.println(myobj.a);
}
}
