public class constructor{
    int x;
    public constructor()
    {
        x = 14;
    }
    public static void main(String[] args)
    {
        constructor myObj = new constructor();
        System.out.println(myObj.x);
    }
}