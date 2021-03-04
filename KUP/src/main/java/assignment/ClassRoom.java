package assignment;

import java.util.List;
import java.util.Optional;

public class ClassRoom {

  //Instance Variables
  private String roomId;
  private Optional<List<Student>> studentList;
  
  //Parameterized Constructor
  public ClassRoom(String roomId, Optional<List<Student>> studentList) {
    this.roomId = roomId;
    this.studentList = studentList;
  }
  
  //Default Constructor
  public ClassRoom() {
  }

  //Getter and Setter
  public String getRoomId() {
    return roomId;
  }

  

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public Optional<List<Student>> getStudentList() {
    return studentList;
  }
  
  public void setStudentList(Optional<List<Student>> studentList) {
    this.studentList = studentList;
  }

  //Overriding toString() method
  @Override
  public String toString() {
    return "ClassRoom [roomID=" + roomId + ", studentList=" + studentList + "]";
  }
  
}
