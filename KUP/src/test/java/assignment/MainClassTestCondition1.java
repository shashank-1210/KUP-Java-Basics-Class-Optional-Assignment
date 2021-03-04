package assignment;



import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MainClassTestCondition1 {

	@Test
	void test() {
		
		
		List<String> expected= new ArrayList<String>();
		expected.add("Saurav");
		expected.add("Sa");
		
		Assert.assertEquals(expected,MainClass.noSubjectAssocited());
		
		
		
	}

}
