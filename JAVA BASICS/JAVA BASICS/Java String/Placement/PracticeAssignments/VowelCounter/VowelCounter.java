class VowelCounter{
    public static int countVowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Try programiz.pro";
        System.out.println("No of lowercase vowels in "+ str + " is "+ countVowels(str));
    }
}