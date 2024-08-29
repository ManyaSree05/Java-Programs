package manya;

public class Dog {
	String name;
	String colour;
public Dog(String x,String y) {
	name = x;
	colour = y;
}
	public static void main(String[] args) {
		Dog myObj =  new Dog("Snoopy","brown");
		System.out.println(myObj.name);
		System.out.println(myObj.colour);
	}
}
