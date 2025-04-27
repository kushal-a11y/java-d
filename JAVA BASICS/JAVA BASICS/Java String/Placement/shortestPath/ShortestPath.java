class ShortestPath {
    public static double displacement(String str){
	int x = 0;
	int y = 0;
	for(int i = 0; i < str.length(); i++){
		char ch = str.charAt(i);
		switch(ch){
			
			case 'E':
				x++;
				break;
			case 'W':
				x--;
				break;
			case 'S':
				y--;
				break;
			case 'N':
				y++;
				break;
		}
			
	}
	
	return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
	
	System.out.println(str + " displacement: "+ displacement(str));
	
    }
}