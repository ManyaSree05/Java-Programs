package manya;

public class add {
	public int sum(int x)
	{
		return x;
	}
	public int sum(int x,int y)
	{
		return (x+y);
	}
	public int sum(int x,int y,int z)
	{
		return (x+y+z);
	}
	public double sum(double x,double y)
	{
		return(x+y);
	}

	public static void main(String[] args) {
		add s = new add();
		System.out.println(s.sum(2));
		System.out.println(s.sum(5,6));
		System.out.println(s.sum(5,5,5));
		System.out.println(s.sum(2.5,2.5));
	}

}
