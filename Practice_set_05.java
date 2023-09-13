import java.util.Scanner;
public class Practice_set_05 {
    public static void main(String[] args) {
        //  Problem No.1
        // Print this pattern
        // ****
        // ***
        // **
        // *
        int n = 4;
        for (int i = n ; i > 0 ; i--){
            for (int j = 0 ; j < i ;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Problem No.2
        //         Write a program to sum first n even numbers using while loops
        
        int sum = 0;
        int n = 4;
        int i = 0;
        while (i < n){
            sum = sum + (2*i);
            i++;
        }
            System.out.print("Sum of even numbers are : ");
            System.out.print(sum);   // first 4 even numbers are 0 , 2 , 4 , 6
    }

        // Problem no.3
        //         Write a program to print multiplication table of a given numbers n
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multiplication table no. ");
        int n = sc.nextInt();
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }

        // Problem no.4
        //         Write a program to print multiplication table of 10 in reverse order

        int n = 10;
        for (int i = n ; i >= 1 ; i--){
            System.out.println(n + " X " + i + " = " + n*i);
        }

        // Problem no.5
        //         Write a program to find factorial of a given number using for loop

                int n = 5;
                int factorial = 1;
                for (int i = 1 ; i <= n ; i++){
                    factorial *= i;
                }
        System.out.println("Factorial of " + n + "!" + " = " + factorial );

       // Problem no.6
       //          Write a program to calculate the sum of the numbers occuring
       //          in the multiplication table of 8

        int n = 8 ;
        int sum = 0;
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(n + " X " + i + " = " + n *i);
            sum += n * i ;
        }
        System.out.println("sum of multiplication table of 8 = " + sum);
    }
}

