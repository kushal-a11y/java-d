class StringCompression{

    public static String compressStr(String str){
	StringBuilder sb = new StringBuilder("");
	int n = str.length();
	for(int i = 0; i < n; i++){
	        Integer count = 1;
		while(i < n - 1 && str.charAt(i) == str.charAt(i + 1)){
			count++;
			i++;
		}
		sb.append(str.charAt(i)).append(count.toString());
	}
	return sb.toString();
    }
    public static String compress(String str){
	char prev = str.charAt(0);
	int count = 1;
	StringBuilder sb = new StringBuilder("");
	sb.append(prev);
	for(int i = 1; i < str.length(); i++){
		char curr = str.charAt(i);
		if(curr == prev){
		   count++;
		}
		else{
		   sb.append(Integer.toString(count)).append(curr);
		   count = 1;
		   prev = curr;	
		}
	}
	sb.append(Integer.toString(count));
	return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbcc";
	
	System.out.println(str + " compressed to  "+ compressStr(str));
	
    }
}