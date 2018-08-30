import java.util.*;
class FirstLast6{
	public static void main(String args[]){
		int size = new Scanner(System.in).nextInt();
		int ary[];
		ary = new int[size];
		System.out.println("please enter elements of array:");
		for(int i=0;i<ary.length;i++){
			ary[i] = new Scanner(System.in).nextInt();
		}
			if((ary[0]==6) || (ary[ary.length-1]==6))
				System.out.println("true");
			else 
				System.out.println("false");
	}
}