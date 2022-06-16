public class prt4 {
    int id=1;
    double salary=10000;
    String name="pooja";
    void mark()
    {
        System.out.println("hello");
    }
    public static void main(String[] args){
        prt4 obj1=new prt4();
        System.out.println(obj1.id);
        System.out.println(obj1.salary);
        System.out.println(obj1.name);
        obj1.mark();
    }
}
