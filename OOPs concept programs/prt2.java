public class prt2 {
    public static void main(String[] args){
        int sun=7;
        int num=6;
        int x=10, y=20;
        if(x+y<=30) {
            System.out.println("the greatest number");
        }
            if(x+y>=30){
            System.out.println("the smallest number");
        }
            else{
                System.out.println("none");
            }
       switch(num){

           case 1:
           System.out.println("new idea ok");
           break;
           case 2:
           System.out.println("no idea sorry");
           break;
           case 6:
           System.out.println("yes ur in place");
           break;
           default:
               System.out.println("better luck next time");
               }
        for(int i=1;i<=10;i++)
        {
            sun=sun+1;
        }
        System.out.println("the sum of project is not avaliable:"+sun);

    }
}
