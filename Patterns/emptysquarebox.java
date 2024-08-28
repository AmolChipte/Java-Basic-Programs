import java.util.Scanner;

public class emptysquarebox {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows");
    int num=sc.nextInt();
    
            // Outer loop for rows
            for (int i = 0; i < num; i++) {
    
                // Inner loop for columns
                for (int j = 0; j < num; j++) {
    
                    // Print star if it's the first or last row or the first or last column
                    if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    }
    
