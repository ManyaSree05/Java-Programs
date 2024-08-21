class MultipleObj {
    int x = 10;
    int y = 7;
    int z = 5;

    public static void main(String[] args) {
        MultipleObj myObj1 = new MultipleObj();
        MultipleObj myObj2 = new MultipleObj();
        MultipleObj myObj3 = new MultipleObj();
        
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
        System.out.println(myObj3.z);
    }
}