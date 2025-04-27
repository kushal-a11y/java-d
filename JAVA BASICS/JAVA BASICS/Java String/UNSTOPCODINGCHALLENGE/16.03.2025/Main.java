import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void oracle(ArrayList<String> l){
        HashMap<String, String[]> h = new HashMap<>();
        for(String i : l){
	    System.out.println(i);
	    h.put(i, new String[]{i.substring(0,1), i.substring(i.length() - 1)});
        }
	for(String i : h.keySet()){
		String vals[] = h.get(i);
		System.out.print(i+ " : " + "[ "+vals[0]+", "+vals[1]+"]");
	}
    }

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            l.add(sc.next());
        }
        oracle(l);
        sc.close();
    }
}