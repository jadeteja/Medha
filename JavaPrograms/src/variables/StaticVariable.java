package variables;

public class StaticVariable {
	public static void main(String[] args) {
		System.out.println(Student.age);
	}
}

class Student{
	String name;
    static int age = 20;
	Student(){ 
		System.out.println(name + " " + age);
	}
}