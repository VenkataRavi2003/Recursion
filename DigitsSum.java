import java.util.Scanner;
public class DigitsSum{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();
			int digitsSum = findDigitsSum(num,0);
			System.out.println("\nSum Of Digits : "+digitsSum);
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static int findDigitsSum(int num,int sum){
		if(num == 0)return sum;
		sum += num % 10;
		return findDigitsSum(num/10,sum);
	}
}