public class pattern {
    //method without parameter
    public void display() {
        for(int i=0;i<10;i++) {
            System.out.println("*");
        }
    }
    //method with single parameter
    public void display(char symbol) {
        for(int i=0;i<10;i++) {
            System.out.println(symbol);
        }
    }
}
class main {
    public static void main(String[] args) {
        pattern d1 = new pattern();
        //call method without argument
        d1.display();
        System.out.println("\n");
        //call method with argument
        d1.display('#');
    }
}
