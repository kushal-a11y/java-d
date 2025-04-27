class UpperCase {

    public static String tOUpper(String str){

	StringBuilder sb = new StringBuilder("");	

	sb.append(Character.toUpperCase(str.charAt(0)));

	for(int i = 1; i < str.length(); i++){
		char ch = str.charAt(i);
		if(ch == ' ' && i < str.length() - 1){
			sb.append(ch);
			i++;
			sb.append(Character.toUpperCase(str.charAt(i)));
		}else{
			sb.append(ch);
		}
	}
	return sb.toString();
    }
    public static String toUpper(String str){
	StringBuilder sb = new StringBuilder("");

	String arr[] = str.split(" ");

	for(int i = 0; i < arr.length; i++){

		sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
	}
	return sb.toString();
    }
    public static void main(String[] args) {
        String str = "la nina eesposero";
	
	System.out.println(str + " changed to  "+ tOUpper(str));
	
    }
}