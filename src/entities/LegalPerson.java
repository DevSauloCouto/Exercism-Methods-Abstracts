package entities;

public class LegalPerson extends Person {
	
	private Integer employees;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double incomeAnual, Integer employees) {
		super(name, incomeAnual);
		this.employees = employees;
	}
	
	@Override
	public Double taxCalculate() {
		if(employees > 10) {
			return (incomeAnual * 14) / 100;
		}
		return (incomeAnual * 16) / 100;
	}

}
