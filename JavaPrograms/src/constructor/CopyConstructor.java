package constructor;

public class CopyConstructor {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Teja",20000);
		Employee e2 = new Employee(e1);
	}
	
}

class Employee{
	String name;
	double salary;
	
	Employee(String n, double s ){
		name = n;
		salary = s;
	}
	Employee(Employee e){
		name = e.name;
		salary = e.salary;
		System.out.println(name + " " + salary);
	}
	
}