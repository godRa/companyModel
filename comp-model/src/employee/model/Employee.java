package employee.model;

import company.model.logic.Person;

public class Employee extends Person {
	private int vechime;
	private int salar;

	public int getVechime() {
		return vechime;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}

	public int getSalar() {
		return salar;
	}

	public void setSalar(int salar) {
		this.salar = salar;
	}

	public Employee(String nume, String adress, String cNP, int vechime, int salar, int vechime2, int salar2) {
		super(nume, adress, cNP, vechime, salar);
		vechime = vechime2;
		salar = salar2;
	}
	
	public Employee () {
		
	}

	@Override
	public String toString() {
		return "Employee [vechime=" + vechime + ", salar=" + salar + "]";
	}
	
	

}
