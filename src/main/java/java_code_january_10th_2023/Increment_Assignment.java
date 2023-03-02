package java_code_january_10th_2023;

public class Increment_Assignment {

	public static void main(String[] args) {

int i = 1; //latest value of i is 1
int j = i++; //latest value of i is 2 and j is 1
int k = ++j; //latest value of k will be 2, j will be 2 
System.out.println("At row 9 the value of j is : " + j); //2
System.out.println("At row 9 the value of k is : " + k); //2

int l = k++ + ++i;

  //l = 2   + 3 = 5
//i becomes 3
// j remains 2
 //k individually becomes 3


  System.out.println(i); //3
  System.out.println(j);  //2
  System.out.println(k); //3
  System.out.println(l); // 5
 

	}

}
