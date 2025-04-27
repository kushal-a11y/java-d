import java.util.*;

class Angrycow{

	static boolean placable(int arr[], int C, int minDiff){

		int count = 1;
		int last = arr[0];
		
		for(int i = 1; i < arr.length; i++){

			if(arr[i] - last >= minDiff){
				count++;

				last = arr[i];
			}
		}
		return count >= C;
	}

	public static void main(String args[]) throws java.lang.Exception{

		Scanner sc = new Scanner(System.in);	
	
		int t = sc.nextInt();

		while(t-- > 0){

			int N = sc.nextInt();

			int C = sc.nextInt();

			int arr[] = new int[N];


			for(int i = 0; i < N; i++){

				arr[i] = sc.nextInt();

			}  
			
			Arrays.sort(arr);
			
			int low = 1;

			int high = arr[N - 1] - arr[0];

			int output = 0;
		
			while(low <= high){

				int m = (low + high) / 2;

				if(placable(arr, C ,m)){
					
					output = m;
					low = m + 1;
				}else{

					high = m - 1;
				}
			
			} 

			System.out.println(output);

		}
	}
}