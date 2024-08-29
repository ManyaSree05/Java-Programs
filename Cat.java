package manya;

public class Cat {
	int age;
	String name;
public Cat() {
	age = 0;
	name = "Unknown";
}
	public static void main(String[] args) {
		Cat myObj = new Cat();
		Cat myObj1 = new Cat();
		System.out.println(myObj.age);
		System.out.println(myObj1.name);
		
	}

}
