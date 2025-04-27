class LargestString {
    public static String largest(String str[]){
	String large = str[0];
	for(int i = 0; i < str.length; i++){
	
		large = (large.compareTo(str[i]) <= 0) ? str[i] : large;		
	}
	
	return large;
    }
    public static void main(String[] args) {
        String str[] = {"apple", "banana", "mango"};
	
	System.out.println(largest(str) + " is the largest string");
	
    }
}