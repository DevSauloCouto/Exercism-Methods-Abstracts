package entities;

public class PhysicalPerson extends Person {
	
	private Double healthSpending;
	
	public PhysicalPerson() {
		super();
	}
	
	public PhysicalPerson(String name, Double incomeAnual, Double healthSpending) {
		super(name, incomeAnual);
		this.healthSpending = healthSpending;
	}
	
	@Override
	public Double taxCalculate() {
		if(incomeAnual < 20000.0 && healthSpending == 0.0) {
			return (incomeAnual * 15) / 100; 
		}
		if(incomeAnual < 20000.0 && healthSpending > 0.0) {
			return ((incomeAnual * 15) / 100) - ((healthSpending * 50) / 100);
		}
		if(incomeAnual >= 20000.0 && healthSpending == 0.0) {
			return (incomeAnual * 25) / 100;
		}
		if(incomeAnual >= 20000.0 && healthSpending > 0.0) {
			return ((incomeAnual * 25) / 100) - ((healthSpending * 50) / 100);
		}
		return 0.0;
	}

}
