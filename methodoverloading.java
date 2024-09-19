public class methodoverloading{
public int product(int x, int y)
{
    return (x*y);
}
public float product(float x,float y,float z)
{
    return (x*y*z);
}
public double product(double x,double y)
{
    return (x*y);
}
public static void main(String[] args)
{
    methodoverloading a = new methodoverloading();
    System.out.println(a.product(5,10));
    System.out.println(a.product(5,9,8));
    System.out.println(a.product(5,23));
}
}
