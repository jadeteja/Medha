package oops;

class Student {
	String name;
	int age;
	String course;
	char gender;
	void studentInfo() {
		System.out.println("Name: "+name+" age: "+age+" course: "+course+" gender: "+gender);
		
	}
	void job() {
		System.out.println(name+" got job");
	}
}

public class StudentDetails{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name	= "Teja";
		s1.age = 21;
		s1.course = "Java";
		s1.gender = 'M';
		s1.studentInfo();
		s1.job();
	}
}