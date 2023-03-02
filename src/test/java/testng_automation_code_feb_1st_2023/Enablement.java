package testng_automation_code_feb_1st_2023;

import org.testng.annotations.Test;

public class Enablement {

	@Test
	public void logic1() {
		
	}
	
	@Test(invocationCount = 5)
	public void logic2() {
		
	}
	
	@Test(enabled = false)
	public void logic3() {
		
	}
	
	@Test
	public void logic4() {
		
	}

}
