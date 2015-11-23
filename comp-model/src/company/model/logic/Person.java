package company.model.logic;

public class Person {

	private String nume;
	private String adress;
	private String CNP;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	@Override
	public String toString() {
		return "Person [nume=" + nume + ", adress=" + adress + ", CNP=" + CNP + "]";
	}

	public Person(String nume, String adress, String cNP, int vechime, int salar) {
		super();
		this.nume = nume;
		this.adress = adress;
		CNP = CNP;

	}

	public Person() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNP == null) ? 0 : CNP.hashCode());
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((nume == null) ? 0 : nume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (CNP == null) {
			if (other.CNP != null)
				return false;
		} else if (!CNP.equals(other.CNP))
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (nume == null) {
			if (other.nume != null)
				return false;
		} else if (!nume.equals(other.nume))
			return false;
		return true;
	}

}
