package constructor;

class Student{
	String name;
	int age;
	boolean gender;
	Student(String name, int age, boolean gender){
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void display() {
		System.out.println("name "+name+" age "+age);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s = new Student("Teja",22,true);
       s.display();
	}

}
