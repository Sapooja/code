interface printable {
    void print();
}
interface Showable {
    void show();
}
class A7 implements printable,Showable {
    public void print()
    {
        System.out.println(" hello");
    }
    public void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
