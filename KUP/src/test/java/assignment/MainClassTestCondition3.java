package assignment;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MainClassTestCondition3 {

	@Test
	void test() {
		
		List<String> expected= new ArrayList<String>();
		expected.add("Hello Student from RoomID = xyz");
		expected.add("Hello Student from RoomID = abc");
		expected.add("Hello Student from RoomID = pqr");
		
		Assert.assertEquals(expected,MainClass.printHello_StudentsAssociated());
		
		
	}

}
