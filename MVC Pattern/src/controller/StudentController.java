package controller;

import model.StudentModel;
import view.StudentView;

public class StudentController {
	private StudentModel model;
	private StudentView view;
	public StudentController(StudentModel model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setStuName(String name) {
		model.setName(name);
	}
	public void setStuRoll(String roll) {
		model.setRoll(roll);
	}
	public void setStuDept(String dept) {
		model.setDept(dept);;
	}
	
	public String getStuName() {
		return model.getName();
	}
	
	public String getStuRoll() {
		return model.getRoll();
	}
	
	public String getStuDept() {
		return model.getDept();
	}
	
	public void ViewFunction() {
		view.viewStudent(model.getName(), model.getRoll(), model.getDept());
	}
	
	

}
