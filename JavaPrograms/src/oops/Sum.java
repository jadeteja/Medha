package oops;

public class Sum {
	int a;
	int b;
	int sum() {
		return a+b;
	}
	int sub() {
		return a - b;
	}
	int mul() {
		return a * b;
	}
	
	int sum(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();
		sum.a = 5;
		sum.b = 6;
		int result = sum.sum();
		System.out.println(result);
		Sum s1 = new Sum();
		int r = s1.sum(5,6);
		System.out.println(r);
		
	}

}
