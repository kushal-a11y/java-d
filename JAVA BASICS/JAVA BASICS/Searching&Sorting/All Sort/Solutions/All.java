// package Solutions;
public class All{
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++ ){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void inserionSort(int arr[]){
        for(int i = 1; i < arr.length; i++ ){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && curr< arr[prev]){
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev + 1] = curr;
            System.out.print("Pass" + (i)  + " " );
            printArray(arr);
        }
    }
    public static void slectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++ ){
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            if(minPos != i){
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
            System.out.print("Pass" + (i)  + " " );
            printArray(arr);
        }
    }
    public static void countingSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i); 
        }

        int count[] = new int[max + 1];

        for(int i : arr){
            count[i]++;
        }
        int j = 0;
        for(int i  = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = {3, 6 ,2, 1, 8, 7, 4, 5, 3, 1};
        System.out.print("Array before sorting: ");
        printArray(arr);

        bubbleSort(arr);
        // inserionSort(arr);
        // slectionSort(arr);
        // countingSort(arr);


        System.out.print("Array after sorting: ");
        printArray(arr);
    }
}