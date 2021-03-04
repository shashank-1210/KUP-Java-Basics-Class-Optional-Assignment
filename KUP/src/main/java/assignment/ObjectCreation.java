package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ObjectCreation {

  static Student student1 = 
		        new Student("Shashank", 1, Optional.ofNullable(Arrays.asList("Science", "Maths")));
  static Student student2 =
		        new Student("Rahul", 2, Optional.ofNullable(Arrays.asList("Hindi", "English", "Maths")));
  static Student student3 =
		        new Student("Raman", 3, Optional.ofNullable(Arrays.asList("Maths", "Java", "Geo")));
  static Student student4 =
		        new Student("Manish", 4, Optional.ofNullable(Arrays.asList("Economics")));
  static Student student5 =
		        new Student("Anmol", 5, Optional.ofNullable(Arrays.asList("Go", "Maths", "Java", "C")));
  static Student student6 =
		        new Student("Saurav", 6, Optional.ofNullable(null));
  static Student student7 =
			    new Student("Sa", 7, Optional.ofNullable(null));
		    
     public static List<Student> StudentList()
     {
	     List<Student> st = new ArrayList<Student>();
		  st.add(student1);
		  st.add(student2);
    	  st.add(student3);
		  st.add(student4);
		  st.add(student5);
		  st.add(student6);
		  st.add(student7);   
		  return st;
	 }
		   
	 public static List<ClassRoom> ClassList()
	{
		 ClassRoom c1 = new ClassRoom("xyz", Optional.ofNullable(Arrays.asList(student1, student2)));
		 ClassRoom c2 = new ClassRoom("abc", Optional.ofNullable(Arrays.asList(student3, student4)));
	     ClassRoom c3 = new ClassRoom("pqr", Optional.ofNullable(Arrays.asList(student5, student6)));
		 ClassRoom c4 = new ClassRoom("klj", Optional.ofNullable(null));
			    
	     List<ClassRoom> c = new ArrayList<ClassRoom>();
		 c.add(c1);
	     c.add(c2);
		 c.add(c3);
	     c.add(c4);
	     return c;   	    
     }
}
