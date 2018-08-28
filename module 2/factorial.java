import java.util.Scanner;
class factorialPrg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	static int factorial(int n){
		if(n <= 1){
			 return 1;
		}
		 else{
		 	  return(n*factorial(n-1));
		 }
	}
}
// def factorial(n):
//     if(n <= 1):
//         return 1
//     else:
//         return(n*factorial(n-1))
// n = int(input())
// print(factorial(n))