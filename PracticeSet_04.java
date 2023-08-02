import java.util.Scanner;

public class PracticeSet_04 {
    public static void main(String[] args) {
        /* Question - 01

         What will the output pf this program
         int a = 10;
         if ( a = 11)
             System.out.println("I am 11 ");
         else
             System.out.println("I am not 11");*/
       // This will through an ERROR!

        // Question - 02

//                 Write a java program to find out whether a student is pass or fail.
//                 If requires total 40% and at least 33% in each subject to pass.Assume 3 -
//                 - subjects and take marks as an input from the user

//        Scanner sc = new Scanner(System.in);
//        byte m1 , m2 , m3;
//        System.out.println("Enter your marks in sub-1");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in sub-2");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in sub-3");
//        m3 = sc.nextByte();
//        float avg = (m1 + m2 + m3 )/3.0f ;
//        System.out.println("Your overall percentage is "+ avg);
//        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
//            System.out.println("You are passed !");
//        }
//        else {
//            System.out.println("You are not passed ! Try again");
//        }
        // Question - 03

             // Calculate income tax paid by an employee to the government as per the stats mentioned below :-
                    // income stats        tax
                    //  2.5l - 5.0l        5%
                    //   5.0l - 10.0l      20%
                    //  above 10.0l        30%
//        System.out.println("Enter your income per anum");
//        Scanner sc = new Scanner(System.in);
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income <= 2.5){
//            tax = tax + 0;
//        }
//        if (income > 2.5 && income <= 5.0) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income > 5.0 && income <= 10.0) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//        }
//        else if (income > 10.0) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("your given tax " + tax);

        // Question no - 4

              // Write a java program to find out the day of the week given the number [ 1 for monday , 2 for tuesday etc...]
             // day given by user input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your day ");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 :
//                System.out.println("Monday");
//                break;
//            case 2 :
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid dai...!");
//        }

        // Question no. - 5

            // Write a java program to find whether a year entered by the user is a leap year or not
                         // Condition check
                              // 1. Century (100 %= 0 && 400 %= 0)  eg. - 2000...2400...2800 -> between 400years difference
                              // 2. Yearly (100 % != 0 && 4 % = 0)  eg. - 2016...2020...2024 -> between 4years difference
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check if it is a leap year not ");
        int year = sc.nextInt();
        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }


        // Question no - 06

             // Write a java program to find out the type of website from the url
                 // .com -> Commercial website
                 // .org -> Organization website
                 // .in -> Indian website

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your url");
//        String website = sc.next();
//        if (website.endsWith(".com")){
//            System.out.println("It is a Commercial website");
//        }
//        else if (website.endsWith(".org")) {
//            System.out.println("It is a Organization website");
//        }
//        else if (website.endsWith(".in")) {
//            System.out.println("Indian website");
//        }
//        else {
//            System.out.println("Invalid url");
//        }
    }
}
