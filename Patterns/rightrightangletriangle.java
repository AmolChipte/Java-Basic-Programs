public class rightrightangletriangle{
	public static void main(String args[]){
		int temp = 4;
		for(int i = 1; i<=4;i++){
			for(int j = 1; j <=4;j++){
				if(j >= temp){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			temp = temp -1;
			System.out.println();
		}
	}
}
