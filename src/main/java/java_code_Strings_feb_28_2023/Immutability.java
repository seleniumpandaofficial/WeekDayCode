package java_code_Strings_feb_28_2023;

public class Immutability {

	public static void main(String[] args) {
		String p1 = "AF"; 
		String p2 = "AF";
		String p3 = "BB"; 
		
		String p100 = "AF";
		
		String S1 = "America";
		S1.concat("States");
		
		System.out.println(S1);
		
		S1 = S1.concat("Of");
		System.out.println(S1);
		

	}

}
