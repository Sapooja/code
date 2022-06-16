abstract class bank {
    abstract int getRateOfInterest();
}
class SBI extends bank {
    int getRateOfInterest(){return 7;}
}
class PNB extends bank {
    int getRateOfInterest(){return 8;}
}
class TestBank{
    public static void main(String[] args) {
        bank b;
        b=new SBI();
        System.out.println("Rate of interest is:" +b.getRateOfInterest()+"%");
        b=new PNB();
        System.out.println("Rate of interest is:" +b.getRateOfInterest()+"%");
    }
}
