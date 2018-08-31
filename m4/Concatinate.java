import java.util.Scanner;
class Concatinate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(strcnct(s));
	}

	static String strcnct(String s){
		String s1 = "Hello ";
		s = s1.concat(s).concat("!");
		return s; 
	}
}