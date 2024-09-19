public class constructoroverloading{
int id;
String name;
public constructoroverloading()
{
    System.out.println("I am a student");
}
public constructoroverloading(int i,String n)
{
    id = i;
    name = n;
}
public static void main(String[] args)
{
    constructoroverloading s = new constructoroverloading(1,"Ram");
    constructoroverloading s1 = new constructoroverloading();
    System.out.println("The id is:"+s.id);
    System.out.println("the name is:"+s.name);
}
}
