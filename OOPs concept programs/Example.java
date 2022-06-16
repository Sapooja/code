public class Example {
    Example()
    {
        System.out.println("Default constructor");
    }
    Example(int i,int j)
    {
        System.out.println("Constructor with two parameters");
    }
    Example(int i,int j,int k )
    {
        System.out.println("constructor with three parameters");
    }
    Example(int i, String name )
    {
        System.out.println("constructor with int and string");
    }
    public static void main(String[] args){
        Example obj1=new Example();
        Example obj2=new Example(12, 12);
        Example obj3=new Example(1,2,3);
        Example obj4=new Example(1,"Book");
    }
}
