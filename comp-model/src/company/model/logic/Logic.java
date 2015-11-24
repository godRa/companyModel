package company.model.logic;

import employee.model.Designer;
import employee.model.Dev;
import employee.model.Employee;
import employee.model.ProjectManager;
import employee.model.QA;
import employee.model.TeamLead;
import work.model.Project;

public class Logic {

	public Logic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = setupCompany();
		printCompanyDetails(company);

	}

	private static void printCompanyDetails(Company company) {
		System.out.println("Numele companiei: " + company.getName());
		System.out.println("Clientul companiei: " + company.getClient().getName());
		Employee[] employees = company.getEmployees();
		int employeeNo = employees.length;
		for (int i = 0; i < employeeNo; i++) {
			Employee e = employees[i];
			System.out.println("Employee: " + e.getNume());

		}

		// TODO Auto-generated method stub

	}

	private static Company setupCompany() {
		Employee[] employees = new Employee[10];

		ProjectManager manager = new ProjectManager();
		manager.setNume("Pop");
		employees[0] = manager;

		TeamLead teamlead1 = new TeamLead();
		teamlead1.setNume("Lead 1");
		employees[1] = teamlead1;

		TeamLead teamlead2 = new TeamLead();
		teamlead2.setNume("Lead 2");
		employees[2] = teamlead2;

		Dev developer1 = new Dev();
		developer1.setNume("Dev1");
		employees[3] = developer1;

		Dev developer2 = new Dev();
		developer2.setNume("Dev2");
		employees[4] = developer2;

		Dev developer3 = new Dev();
		developer3.setNume("Dev3");
		employees[5] = developer3;

		Dev developer4 = new Dev();
		developer4.setNume("Dev4");
		employees[6] = developer4;

		QA tester1 = new QA();
		tester1.setNume("QA 1");
		employees[7] = tester1;

		QA tester2 = new QA();
		tester2.setNume("QA 2");
		employees[8] = tester2;

		Designer designer = new Designer();
		designer.setNume("Botezatu");
		employees[9] = designer;

		Company companie = new Company();
		companie.setName("FIRMA");
		companie.setEmployees(employees);

		Client client = new Client();
		client.setName("The Client");
		companie.setClient(client);

		Project project1 = new Project();
		project1.setName("VISA1");
		project1.setClient(client);
		manager.setProject1(project1);
		designer.setProject1(project1);
		teamlead1.setProject(project1);
		developer1.setProject(project1);
		developer2.setProject(project1);
		tester1.setProject(project1);

		Project project2 = new Project();
		project2.setName("VISA2");
		project2.setClient(client);
		manager.setProject2(project2);
		designer.setProject2(project2);
		teamlead2.setProject(project2);
		developer3.setProject(project2);
		developer4.setProject(project2);
		tester2.setProject(project2);
		return companie;
	}

}
