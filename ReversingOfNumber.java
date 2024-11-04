import java.util.Scanner;
public class ReversingOfNumber{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();
			int reversed = reverseNum(num,0);
			System.out.println("\nReversed Number : "+reversed);
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static int reverseNum(int num,int reversed){
		if(num == 0)return reversed;
		reversed = (reversed * 10) + num % 10;
		return reverseNum(num/10,reversed);
	}
}