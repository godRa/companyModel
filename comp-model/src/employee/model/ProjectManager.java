package employee.model;

import work.model.Project;

public class ProjectManager extends Employee{
	
	public Project project1;
	public Project project2;
	
	
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

	public void guideProjects() {
		System.out.println("Guide the Projects");
	}
	
	public void reportToClient(){
		System.out.println("Reports to the Client");
	}
	public void reportToCEO(){
		System.out.println("Reports to the Client");
	}

	
	
	
}
