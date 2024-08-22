package manya;

class Employee{
	int salary = 500;
}
class Engineer extends Employee{
	int bonus = 500;
}

public class inheritance {

	public static void main(String[] args) {
		Engineer e1 = new Engineer();
		System.out.println("salary "+e1.salary+"\nBonus "+e1.bonus);
	}
}
