public class triangle{
	public static void main(String args[]){
		int tempinc = 4;
		int tempdec = 4;
		for(int i = 1; i<=4;i++){
			for(int j = 1; j <=7;j++){
				if(j >= tempinc && j <= tempdec){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			tempinc = tempinc -1;
			tempdec = tempdec +1;

			System.out.println();
		}
	}
}
