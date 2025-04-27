class LargestinArray{

	public static int find(int arr[]){

		int max = arr[0];

		for(int i = 1; i < arr.length; i++){

			max = Math.max(arr[i],max);

		}
		return max;
	}

	public static void print(int arr[]){

		for(int i = 0; i < arr.length; i++){

			System.out.print(arr[i]+" ");
		}

	}

	public static void main(String args[]){

		int arr[] = {1,2,6,3,5};

		int largest = find(arr);

		System.out.print("Largest elemnt in ");
		
		print(arr);

		System.out.print(" is: "+largest);
		
	}

}