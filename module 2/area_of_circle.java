import java.util.Scanner;
class area_of_circle{
	static double pi(){
		return 3.14;
	}
	static double area(double radius){
		double area = pi()*radius*radius;
		return area;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		System.out.println(area(radius));		
	}
}