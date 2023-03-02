package testng_automation_code_mar_1st_2023;

import org.testng.annotations.Test;
@Test(groups = "CompleteClassLevelTests")
public class Understanding_Groups {
	
	@Test(groups = {"smoke"})
	public void testcase1() {
		System.out.println("This is tc1");
	}
	
	@Test(groups = {"smoke", "sanity"})
	public void testcase2() {
		System.out.println("This is tc2");
	}
	
	@Test(groups = {"sanity", "smoke", "regression"})
	public void testCase3() {
		System.out.println("This is tc3");	
	}
	
	@Test(groups = {"windows.sanity"})
	public void testCase4() {
		System.out.println("This is tc4");
	}
	
	
	@Test(groups = {"regression"})
	public void testCase5() {
		System.out.println("This is tc5");
	}

}
