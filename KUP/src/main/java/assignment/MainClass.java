package assignment;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("***********FIRST***********");
		
		System.out.println(noSubjectAssocited());
		
		System.out.println("***********SECOND***********");
		
		System.out.println(subjectsAssociated_xyz());
		
		System.out.println("***********THIRD***********");
		
	    System.out.println(printHello_StudentsAssociated());	

	}
	
	
	// Find the students associated that have no subjects associated.

	public static List<String> noSubjectAssocited()
	{
		return ObjectCreation.StudentList()
				.stream()
				.filter(obj -> obj.getSubject().isEmpty())
				.map(k->k.getName())
	            .collect(Collectors.toList());
		
	}
	

	// Find the students associated that have no subjects associated.
	
	public static Set<String> subjectsAssociated_xyz()
	{
		List<List<Student>> students=ObjectCreation.ClassList().
				stream().
				filter(obj->obj.getRoomId().equals("xyz"))
				.map(k->k.getStudentList().get())
				.collect(Collectors.toList());
		   
		List<List<String>> l=students.get(0)
				.stream()
				.filter(k->k.getSubject().isPresent())
				.map(a->a.getSubject().get())
				.collect(Collectors.toList());
		   
		return l.stream()
				.flatMap(j -> j.stream())
				.collect(Collectors.toSet());
	 }
	
	// print "hello Student" if a room has students associated.
	
	public static  List<String> printHello_StudentsAssociated()
	{
	
	    return ObjectCreation.ClassList()
			   .stream()
			   .filter(obj -> obj.getStudentList().isPresent())
			   .map(a->"Hello Student from RoomID = "+a.getRoomId())
			   .collect(Collectors.toList());
		    
	}
	
	}









