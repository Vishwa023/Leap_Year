import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class leapyearcheckertest {

//	creating test object
	leapyearchecker testObject;
	
//	set testObject to new
//	void setUp() {
//		
//		testObject = new leapyearchecker();
//	}
	
//	checking 
	@Test
	void test() throws Exception {
		leapyearchecker testObject = new leapyearchecker(); 
		assertNotNull(testObject);
	}
	
	
//	checking first TestCase(year = 3200) for leapyear and if test fails then add conditions in the isLeapyear() function
	@Test
	void firsttest() throws Exception{
		
		leapyearchecker testObject = new leapyearchecker(); 
		
		assertTrue(testObject.isLeapyear(3200));
	}

	
//    checking for second testcase 32 for more improvement of code
	@Test
	void secondtest() throws Exception{
		
		leapyearchecker testObject = new leapyearchecker();
		
		assertTrue(testObject.isLeapyear(32));
	}
}
