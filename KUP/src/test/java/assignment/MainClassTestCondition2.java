package assignment;



import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MainClassTestCondition2 {

	@Test
	void test() {
		
	Set<String> expected= new HashSet<String>();
	
	expected.add("Maths");
	expected.add("English");
	expected.add("Science");
	expected.add("Hindi");
	 
	 
	Assert.assertEquals(expected,MainClass.subjectsAssociated_xyz());
		
	}

}
