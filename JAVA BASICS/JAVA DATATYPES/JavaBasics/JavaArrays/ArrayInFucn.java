//Passing array to a function -> call by reference passing the actual object reference ---primitives call by value


class ArrayInFucn{

	public static void print(int arr[]){

		for(int i = 0; i < arr.length; i++){

			System.out.print(arr[i]+" ");
		}

		System.out.println("");

	}

	public static void update(int arr[], int unchangeable){

		unchangeable = 12;
		
		System.out.println("Within function unchangeable value is : "+unchangeable);
	
		for(int i = 0; i < arr.length; i++){

			arr[i] = arr[i] + 1;

		}
	}

	public static void main(String args[]){

		int arr[] = {97,98,99};

		int unchangeable = 16;
		
		update(arr,unchangeable);

		print(arr);

		System.out.print("Outside function unchangeable value is : "+unchangeable);

		
	}

}  