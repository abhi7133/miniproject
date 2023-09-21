// program for the playing game with the computer (game=rock,paper,scissor)
package javalec;
import java.util.Random; // we import this class to taking input from the computer
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1 for rock,2 for paper,3 for scissor");
            System.out.print("enter your choice number:");
            int usernum = sc.nextInt();
            System.out.println(usernum);
            Random ran = new Random();
            int computer = ran.nextInt(1, 3);
            System.out.println("computer choice is :" + computer);

            if (computer == usernum) {
                System.out.println("the match is draw");
            } else if (usernum == 1 && computer == 3 || usernum == 3 && computer == 2 || usernum == 2 && computer == 1) {
                System.out.println("you win !"); // all winning condition of the user are is in the else if condition.
            } else {
                System.out.println("computer win");// when all winning condition are fail of user then the computer wins.
            }
        }while(true);
    }
}
