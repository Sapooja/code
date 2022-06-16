public class language {
    public void displayInfo() {
        System.out.println("common english language");
    }
}
class java extends language {
    public void displayInfo() {
        System.out.println("java programming language");
    }
}
class Main {
    public static void main(String[] args) {
        //create an object of java class
        java j1 = new java();
        j1.displayInfo();
        // create an object of language class
        language l1 = new language();
        l1.displayInfo();
    }
}
