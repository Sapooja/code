public class amstrong {
    public static void main(String[]args){
        int num=153;
        int num1=num;
        int r,s=0;
        while(num>0)
        {
            r=num%10; //Getting last digit 153%10=3 reminder is consider
            s=s+r*r*r; // cubing last digit value is stored in s=27
            num=num/10;
        }
        if(num1==s)
            System.out.println("Amstrong number");
        else
            System.out.println("not an amstrong number");
    }
}
