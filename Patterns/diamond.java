import java.util.Scanner;

public class diamond {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter rows of diamond :");
           int n=sc.nextInt();
      
          // Print the top half of the diamond
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
              System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
              System.out.print("* ");
            }
            System.out.println();
          }
      
          // Print the bottom half of the diamond
          for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
              System.out.print(" ");             }
            for (int j = 0; j <= i; j++) {
              System.out.print("* ");
            }
            System.out.println();
          }
        }
      }
    
