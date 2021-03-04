package assignment;

import java.util.List;
import java.util.Optional;




public class Student {

  //Instance Variables
  private String name;
  private int rollNumber;
  private Optional<List<String>> subject;
  
  //Parameterized Constructor 
  public Student(String name, int rollNumber, Optional<List<String>> subject) {	  
    this.name = name;
    this.rollNumber = rollNumber;
    this.subject = subject;
  }
  
  //Default constructor
  public Student() {
  }

  //Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }
  
  public Optional<List<String>> getSubject() {
    return subject;
  }

  public void setSubject(Optional<List<String>> subject) {
    this.subject = subject;
  }
  
  //Overriding toString() method
  @Override
  public String toString() {
    return "Student [name=" + name + ", rollNumber=" + rollNumber + ", subject=" + subject + "]";
  }

}
