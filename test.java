import java.util.Scanner;

public class test
{
 public static void main(String[] args)
 {
     Scanner scan = new Scanner(System.in);
     System.out.println(" --------------------------------------------");
     System.out.println("|       Welcome to Test competition          |");
     System.out.println(" --------------------------------------------");
     System.out.println("Question 1 : What is the Sum of 10 + 4..?");
     String ans = scan.next();

     while (!ans.equals("fourteen") && !ans.equals("Fourteen") && !ans.equals("14"))
     {
         System.out.println("Your answer is Wrong.. Read the Question again..");
         ans = scan.next();
     }
     System.out.println("Great you had right Answer..!");
     System.out.println("Question 2: Which is the Capital of India..?");
     String ans2 = scan.next();

     while (!ans2.equals("Delhi") && !ans2.equals("delhi"))
     {
         System.out.println("Your answer is wrong.. please write correct Answer..!!");
         ans2 = scan.next();
     }
         System.out.println("Well done.. Your answer is correct..!!");

         System.out.println("Question 3 :How many colors are there in Rainbow..? ");
         String ans3 = scan.next();
     while (!ans3.equals("seven") && (!ans3.equals("Seven")) && (!ans3.equals("7")))
     {
         System.out.println("Your answer is wrong..Please try again..");
         ans3 = scan.next();
     }
         System.out.println("Great..you pass the Test..!");
 }
}
