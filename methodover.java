package manya;
class Animal{
	public void move() {
		System.out.println("Animal is moving");
	}
}
	class cheetah extends Animal{
		public void move() {
			System.out.println("Animal is running");
		}
	}

public class methodover {

	public static void main(String[] args) {
		cheetah c1 = new cheetah();
		c1.move();
		

	}

}
