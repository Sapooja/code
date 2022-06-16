public class prt3 {
    public static void main(String[] args){
        int num1=36, num2=35, num3=56;
        if(num1>=num2)
        {
            if(num1>=num3) {
                System.out.println("num1 is largest");
            }
            else{
                System.out.println("num3 is largest");
            }
        }
        else if(num2>=num3)
        {
            System.out.println("num2 is largest");
        }
        else{
            System.out.println("num3 is largest");
        }
    }
}


