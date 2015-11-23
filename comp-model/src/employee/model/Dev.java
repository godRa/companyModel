package employee.model;

import work.model.Project;

public class Dev extends Employee {
		
	public void develops() {
		System.out.println("Developing software");
	}
	
	public void reportToTL() {
		System.out.println("Reports to the Team Lead");
	}
	
	public void reportToPM(){
		System.out.println("Reports to the Project manager");
	}
	
	public Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
