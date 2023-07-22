import java.util.Scanner;

public class PracticeSet_01 {
    public static void main(String[] args) {
//        Question - 1 - Sum of three numbers
            int num1 = 23;
            int num2 = 20;
            int num3 = 5;
            int sum = num1 + num2 + num3;
            System.out.println("Sum of three numbers are " +sum);

//        Question - 2 - Calculate CGPA using marks of three subjects out of 100
            float sub1 = 78;
            float sub2 = 80;
            float sub3 = 35;
            float CGPA = (sub1 + sub2 + sub3)/30;
            System.out.println(CGPA);

//        Question - 3 Ask the user to enter your name and greats them with "Hello" have a good day
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = sc.next();
       System.out.println(name + " have a good day");

       Question - 4 Convert kilometer to miles
           System.out.println("Enter the kilometers");
           Scanner sc = new Scanner(System.in);
           double kilometers = sc.nextDouble();
           double miles = kilometers * 0.621371;   1 kilometer is approximately 0.621371 miles
           System.out.println(kilometers + " is equals to " +miles);

//        Question - 5  Detect whether a number entered by the user is integer or not
            System.out.println("Enter your number");
            Scanner sc = new Scanner(System.in);
            System.out.println(sc.hasNextInt());
        }
}
