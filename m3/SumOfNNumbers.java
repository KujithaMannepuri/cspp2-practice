import java.util.Scanner;
class SumOfNNumbers{
	public static void main(String[] args){
		int sum = 0;
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1;i<=num;i++){
			sum = sum+i;
		}
		System.out.println("total sum of the numbers is:"+sum);
	}
}