import java.util.Scanner;

class Q1{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no: ");
		int A = sc.nextInt();
		System.out.println("Enter Second no: ");
		int B = sc.nextInt();
		System.out.println("Enter third no: ");
		int C = sc.nextInt();
		int avg = (int)(A+B+C)/3;
		System.out.println("Average of "+A+", "+B+", "+C+" is: "+avg);

	}

}