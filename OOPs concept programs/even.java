public class even {
    public static void main(String[] args){
        int i, fact=1;
        int number=4;
       /* int number=100;
        System.out.println("list of even numbers from 1 to" +number+":");
        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
        }*/
       for(i=1;i<=number;i++)
       {
           fact=fact*i;
       }
       System.out.println("factorial of" +number+ "is:"+fact);
    }
}
