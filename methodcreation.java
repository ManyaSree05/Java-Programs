public class methodcreation{
    public void method()
    {
        System.out.println("Creating my first method");
    }
    public void method2(){
        System.out.println("2nd method");
    }
public static void main(String[] args)
{
    methodcreation myobj1 = new methodcreation();
    myobj1.method();
    myobj1.method2();
}
}
