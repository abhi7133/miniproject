package javalec;
import java.util.Random;
import java.util.Scanner;
class game{
   public int number;
   public int userinput;
   public int noofguess=0;
    public game(){
       Random rc=new Random();
       number=rc.nextInt(1,100);
     //   System.out.println(number);

    }
    void takeusernumber(){
        System.out.println("guess the number");
     Scanner sc=new Scanner(System.in);
     userinput=sc.nextInt();
    }
    boolean iscorrectnumber(){
        noofguess++;
       if(number==userinput){
           System.out.println("congratulations you choose the correct number");
           System.out.println("number of guess is :"+noofguess);
           return true ;
       }
       else if(number>userinput){
           System.out.println("to less..");
        }
       else if(number<userinput){
           System.out.println("to high..");
       }
       return false ;
    }

//    public int getNoofguess() {
//        return noofguess;
//    }
//
//    public void setNoofguess(int noofguess) {
//        this.noofguess = noofguess;
//    }
}
public class lec43 {
    public static void main(String[] args){
        game g = new game();
        boolean b=false;
        while(!b) {
            g.takeusernumber();
            b = g.iscorrectnumber();

        }
    }
}
