public class Student {
private int studentId;
private String studentName;
private String collegeName;
private String address;
public int getStudentId(){
	return studentId;
}
public String getStudentName(){
	return studentName;
}
public String getCollegeName(){
	return collegeName;
}
public String getAddress(){
	return address;
}
public void setStudentId(int studentId){
	this.studentId=studentId;
}
public void setStudentName(String studentName){
	this.studentName=studentName;
}
public void setCollegeName(String collegeName){
	this.collegeName=collegeName;
}
public void address(String address){
	this.address=address;
}
}

class Test{
public static void main(String[] args){
Student s=new Student();

s.setStudentId(13);
System.out.println(s.getStudentId());
s.setStudentName("Tim Baker");
System.out.println(s.getStudentName());
s.setCollegeName("Secret Heart");
System.out.println(s.getCollegeName());
s.address("20 Long Street, London, E10 2WW");
System.out.println(s.getAddress());
}
}
