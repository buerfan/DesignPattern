package packing;

public class EmployeeData {
	public static String[] names = {"Pranta", "Kumar", "Biswas"};
	
	public static AbstractEmployee getEmployee(String name) {
		System.out.println("Searching for....."+name);
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new Employee_RealObject(name);
			}
		}
		return new Employee_NullObject();
	}

}
