//Linear Search -- scanning the whole array one by one until the match is found


class LinearSearch{


	public static int search(int arr[], int key){
	
		for(int i = 0; i < arr.length; i++){

			if(arr[i] == key){

				return i;
			
			}

		}
		return -1;
	}

	public static void main(String args[]){

		int arr[] = {2,4,6,8,10,12,16};

		int key = 10;

		int result = search(arr,10);
		
		if( result!= -1)
			System.out.println("Element found at position : "+(result+1));
		else
			System.out.println("Element not found. ");


		
	}

}  