package java_code_Strings_feb_28_2023;

public class StringOperations {

	public static void main(String[] args) {
		
		/*
		 * String S0 = null; System.out.println(S0.length());
		 */
		
		String S1 = "I am coding Selenium with Java";
        System.out.println(S1.length());
        
        String S2 = "";
        System.out.println(S2.isEmpty());
        
        String S3 = "   I am driving   ";
        System.out.println(S3.length());
        
        String S4 = S3.trim();
        System.out.println(S4.trim());
        System.out.println(S4.length());
        
        String S5 = "      I am writing Python code      ";
        System.out.println(S5.length());
        System.out.println(S5.trim().length());
        
        System.out.println("*************************************************************");
        
        //Comparison between Strings
        
        String S6 = "World";
        String S7 = "WOrld";
        System.out.println(S6.equals(S7));
        System.out.println(S6.equalsIgnoreCase(S7));
        
        String S8 = "a"; //97
        String S9 = "A"; //65
        System.out.println(S8.compareTo(S9));
        
        String S10 = "b";
        String S11 = "c";
        System.out.println(S10.compareTo(S11));
        System.out.println(S11.compareTo(S10));
        
        String S12 = "Hello";
        String S13 = S12.concat("World");
        System.out.println(S13);
        
        String S14 = "Honda";
        String S15 = "BWM";
        String S16 = "Mercedes";
        System.out.println(String.join("| ", S14, S15, S16));
        
        String S17 = "IamplayingHockey";
        System.out.println(S17.substring(0, 11));
        System.out.println(S17.substring(0,0));
        
        //replace()
        //replaceFirst()
        //replaceAll()
        
        //indexOf()
        //lastInfexOf()
        //charAt()
        //contains()
        //endsWith()
        //startsWith()
        
        //toLowerCase()
        //toUpperCase()
        //valueOf()
        //toCharArray()
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
