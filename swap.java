public class swap{
    public static void swap1(int x,int y)
    {
        x = x+y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping: "+x +","+y);
    }
    public static void swap2(int x,int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping: "+x+","+y);
    }
    public static void main(String[] args)
    {
        swap1(10,5);
        swap2(66,56);
    }
}