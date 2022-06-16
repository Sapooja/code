public class Employee {
    void salary()
    {
        System.out.println("salary=20000");
    }
}
class programmer extends Employee {
    void bonus() {
        System.out.println("bonus=50000");
    }
}
class single_inheritance {
    public static void main(String[] args) {
        programmer p =new programmer();
        p.salary();
        p.bonus();
    }
}
