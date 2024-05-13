import java.util.Scanner;
public class PrintYourName_N_Times{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Your Name : ");
		String name = sc.next();

		System.out.print("\nEnter n : ");
		int n = sc.nextInt();

		printName(n,name);

		sc.close();
	}

	static int i = 1;
	public static void printName(int n,String name){

		if(i > n){
			return;
		}
		System.out.println(name);
		i++;
		printName(n,name);
	}
}