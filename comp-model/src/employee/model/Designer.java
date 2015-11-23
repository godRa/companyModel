package employee.model;

import work.model.Project;

public class Designer extends Employee {

	public Project project1;
	public Project project2;
		
	public void createMockups() {
		System.out.println("Developing mock-ups for the project");
	}
	
	public void reportToPM(){
		System.out.println("Reports to the Project manager");
	}

	public Project getProject1() {
		return project1;
	}

	public void setProject1(Project project1) {
		this.project1 = project1;
	}

	public Project getProject2() {
		return project2;
	}

	public void setProject2(Project project2) {
		this.project2 = project2;
	}



}
