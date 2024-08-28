import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage");
		float per = sc.nextFloat();
		if(per > 90 && per <= 100) {
			System.out.println("A+ Grade");
		}else if(per > 80 && per <= 90) {
			System.out.println("A Grade");
		}else if(per > 70 && per <= 80) {
			System.out.println("B Grade");
		}else if(per > 60 && per <= 70) {
			System.out.println("C Grade");
		}else if(per > 50 && per <= 60) {
			System.out.println("D Grade");
		}else if(per >= 35 && per <= 50){
			System.out.println("E Grade");
		}else if(per >= 0 && per < 35) {
			System.out.println("F Grade");
		}else {
			System.out.println("Something Went Wrong");
		}
		sc.close();
	}

}
