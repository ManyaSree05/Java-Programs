class thiskey{
    public void display(){
        this.show();
        System.out.println("Animals know how to walk");
    }
    public void show(){
        System.out.println("Animals can sleep ");
    }
    public static void main(String[] args)
    {
        thiskey a = new thiskey();
        a.display();
    }
}
