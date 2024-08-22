package manya;
class Fruit
{
	public void display()
	{
		System.out.println("I like Mango");
	}
}
class Mango extends Fruit{
	public void display()
	{
		System.out.println("Mango is my favourite fruit");
	}
}

public class methodoveriding {

	public static void main(String[] args) {
		Mango m1 = new Mango();
		m1.display();
	}

}
