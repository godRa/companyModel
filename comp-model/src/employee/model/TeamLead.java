package employee.model;

import work.model.Project;

public class TeamLead extends Employee{

	
	public void develop() {
		System.out.println("Developing software");
	}
	
	public void guidesTheDEV() {
		System.out.println("Guides the Devs");
	}
	
	public void reportToPM(){
		System.out.println("Reports to the Project manager");
	}
	
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
}
