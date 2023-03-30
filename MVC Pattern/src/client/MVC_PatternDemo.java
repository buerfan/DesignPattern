package client;

import view.StudentView;
import controller.StudentController;
import model.StudentModel;

public class MVC_PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentModel model = CreateStudentDatase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		System.out.println("Main from Database");
		controller.ViewFunction();
		
		System.out.println("\n Updating Name...");
		controller.setStuName("My Full Name");
		controller.ViewFunction();
		
		System.out.println("\n Updating Roll...");
		controller.setStuName("My Class Roll");
		controller.ViewFunction();

		
		System.out.println("\n Updating Dept...");
		controller.setStuName("Computer Science and Engineering");
		controller.ViewFunction();


	}
	
	public static StudentModel CreateStudentDatase() {
		StudentModel student = new StudentModel();
		student.setName("Name");
		student.setRoll("MyRoll");
		student.setDept("CSE");
		return student;
	}

}
