import java.util.Scanner;
class StDetails {
	public StDetails (String name, String rollNum, double m1, double m2, double m3) {
		double gpa = ((m1+m2+m3)/3);
		System.out.println("average is = "+gpa);
		}
	}
public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String rollNum = sc.nextLine();
		double s_mark1 = sc.nextDouble();
		double s_mark2 = sc.nextDouble();
		double s_mark3 = sc.nextDouble();
		StDetails sd = new StDetails(name, rollNum, s_mark1, s_mark2, s_mark3);
	}
}

