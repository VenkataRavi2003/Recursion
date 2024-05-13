import java.util.Scanner;
public class Printing_1_to_N_NaturalNumbers{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter N : ");
		int N = sc.nextInt();

		printNums(N);

		sc.close();
	}
	static int i = 1;
	public static void printNums(int N){

		if(i > N){
			return;
		}else{
			System.out.print(i+",");
			i++;
			printNums(N);
		}

	}
}