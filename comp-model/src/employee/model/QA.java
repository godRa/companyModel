package employee.model;

import work.model.Project;

public class QA extends Employee{

		public void doManualTesting() {
			System.out.println("Manual testing of the  software");
		}
		public void develop() {
			System.out.println("Automated testing of the software - developing");
		}
		public void reportToTL() {
			System.out.println("Report to the Team Lead");
		}
		
		public void reportToPM(){
			System.out.println("Report to the Project manager");
		}
	public Project project;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
		

}
