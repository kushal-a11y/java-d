import java.util.Scanner;
import java.util.Arrays;
class Solution{

	static int findTotalExercises(int arr[],int E){

		Arrays.sort(arr);

		int count = 0;

		int i = arr.length - 1;

		while(i >= 0){

			System.out.println("Energy left after "+ count + "exercises is "+E);

			if(E <= 0) return count;
		
			else if(arr[i] > E) return 1;

			E = E - arr[i] * 2;

			count+=2;

			i--;
		
		}

		
		return (E <= 0) ? count : -1;
		
	
	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter total energy");

		int E = Integer.parseInt(sc.next());

		System.out.print("Enter no of exercises");


		int N = Integer.parseInt(sc.next());

		int arr[] = new int[N]; 
		
		System.out.print("Enter total energy spent per exercise");


		for(int i = 0; i < N; i++){

			arr[i]  = Integer.parseInt(sc.next());
		} 

		System.out.println("Total Energy " + E);

		System.out.println("Excercises are");

		for(int i = 0; i < N; i++){

			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");

		int n = findTotalExercises(arr,E);

		System.out.println("Total no of exercises are "+ n);

	}
}