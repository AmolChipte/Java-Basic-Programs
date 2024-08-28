import java.util.*;

public class pallindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int temp = n;
		int rem=0, sum=0;
		while(n>0){
			rem = n %10;
			sum = sum + rem;
			n = n /10;
		}
		if(temp == sum){
			System.out.println("Number is Pallindrome");
		}else{
			System.out.println("Number is NOT Pallindrome");
		}
		sc.close();
	}
}
