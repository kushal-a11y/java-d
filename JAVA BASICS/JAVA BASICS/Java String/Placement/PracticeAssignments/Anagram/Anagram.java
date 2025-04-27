public class Anagram{
    public static boolean isAnagram(String str1,String str2){
        int freq[] = new int[256];
        
        if(str1.length() != str2.length())
            return false;        
        for(int i = 0; i < str1.length(); i++){
            freq[(int)Character.toLowerCase(str1.charAt(i))]++;
            freq[(int)Character.toLowerCase(str2.charAt(i))]--;
        }
        for(int i : freq)
            if(i != 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "Rac";
        if(isAnagram(str1,str2))
            System.out.println("Yes! Anagram detected");
        else
            System.out.println("Not an Anagram pair");
    }
}