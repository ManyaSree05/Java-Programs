package manya;
import java.util.Scanner;
public class studentdetails {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Scanner Input1 = new Scanner(System.in);
		System.out.println("Enter Student name:");
		String s = Input.nextLine();
		System.out.println("Enter Student ID:");
		int i = Input1.nextInt();
		System.out.println("Enter Student dept:");
		String dept = Input.nextLine();
		System.out.println("Enter Student sec:");
		String sec = Input.nextLine();
		System.out.println("Name: "+s);
		System.out.println("ID: "+i);
		System.out.println("Dept: "+dept);
		System.out.println("sec "+sec);
	}

}
