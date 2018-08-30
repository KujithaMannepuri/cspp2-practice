import java.util.*;
class Average{
	public static void main(String[] args) {
		double sum = 0;
		System.out.println("Enter size of the array:");
		int n = new Scanner(System.in).nextInt();
		int ary[] = new int[n];
		System.out.println("please enter elements of array:");
		for(int i=0;i<ary.length;i++){
			ary[i] = new Scanner(System.in).nextInt();
			sum = sum + ary[i];
		}
		double avg = sum/n;
		System.out.println("Average of the elements:"+ avg);
	}
}