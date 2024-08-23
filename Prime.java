public class Prime {
    public static void prime(int x) {
        int count = 0;
        for(int i = 1; i <= x; i++) {  
            if(x % i == 0) {
                count += 1;
            }
        }
        if(count == 2) { 
            System.out.println("Is prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        int x = 5;  
        prime(x);
    }
}