package manya;
class Shape{
	public void getarea() {
		System.out.println("area");
	}
}
	class rectangle extends Shape{
		public void getarea()
		{
			int x = 2,y = 3;
			int area = x*y;
			System.out.println("area = "+area);
		}
	}
public class methodoverriding {

	public static void main(String[] args) {
		rectangle r1 = new rectangle();
		r1.getarea();
	}

}
