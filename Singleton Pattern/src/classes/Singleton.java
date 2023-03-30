package classes;

public class Singleton {
	public static Singleton single = new Singleton();
	private Singleton() {};
	public static Singleton getInstance() {
		return single;
	}
	
	public int getSum(int num1, int num2) {
		return num1+num2;
	}
	public void showMessag() {
		System.out.println("Hi this is Pranta");
	}

}
