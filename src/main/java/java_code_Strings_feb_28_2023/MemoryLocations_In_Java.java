package java_code_Strings_feb_28_2023;

public class MemoryLocations_In_Java {

	public static void main(String[] args) {
		//Heap Area [SCP / SLP is inside this heap area]
		//Stack Area
		//Method Area
		//PC Register
		//NativeMethod Area
	
		//which key is used to create Object
		//the moment new keyword is used to create an Object, the object occupies memory space in Heap area
		
		String S1 = new String(); //1 object got created in Heap Area
		
		String S2 = new String("Java"); //2 objects are created
		//the object created by new keyword will go in Heap Area
		//the literal created will act as another object and it will be taking memory in SLP/SCP
		
		String S3 = "Python"; // 1 object will be created and it will be directly inside the SLP/SCP area
		
		String S4 = "Java"; //0
		String S5 = "Java"; //0
		
		

	}

}
