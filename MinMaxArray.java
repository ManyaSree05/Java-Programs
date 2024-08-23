public class MinMaxArray {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        
        int max = x[0]; 
        int min = x[0]; 

        for(int i = 1; i < x.length; i++) { 
            if(x[i] > max) {
                max = x[i];
            }
            if(x[i] < min) {
                min = x[i];
            }
        }
        
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
