package oops;
import java.util.Scanner;

class Evenodd{
	void findEvenOdd(int num)
	{
		if(num%2==0) {
			System.out.println(num+"  is even ");
		}
		else {
			System.out.println(num+"  is odd ");
		}
	} 
	
}

 class Userdefinedmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre a number: ");
		int num=sc.nextInt();
		Evenodd obj=new Evenodd();
		
		obj.findEvenOdd(num);

	}

}
