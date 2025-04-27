import java.util.Arrays;


class BinSearch{

	public static int search(int arr[], int key){
		
		Arrays.sort(arr);

		int l = 0, h = arr.length - 1;

		while(l <= h){

			int mid = (int)(l + h)/2;

			if(arr[mid] == key)
				return mid;

			else if(arr[mid] < key){

				l = mid + 1;

			}else if(arr[mid] > key){

				h = mid - 1;
			
			}

		}
		return -1;
		

	}

	public static void main(String args[]){

		int arr[] = {2,4,6,8,10,12,14};
	
		int key = 10;
	
		int result = search(arr,key);

		if(result != -1){
			
			System.out.println("Element found at index no "+result);			

		}else{

			System.out.println("Element not found. ");			


		}

	}


}