package entities;

public abstract class Person {

	protected String name;
	protected Double incomeAnual;
	
	public Person() {
	}
	
	public Person(String name, Double incomeAnual) {
		this.name = name;
		this.incomeAnual = incomeAnual;
	}
	
	public abstract Double taxCalculate();
	
	public String getName() {
		return name;
	}
}
