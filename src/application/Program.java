package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> listPerson = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Income anual: ");
			Double incomeAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthSpending = sc.nextDouble();
				
				listPerson.add(new PhysicalPerson(name, incomeAnual, healthSpending));
			} else {
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();
				
				listPerson.add(new LegalPerson(name, incomeAnual, employees));
			}
		}
		
		Double totalTax = 0.0;
		
		System.out.println("");
		System.out.println("TAXES PAID:");
		for(Person person : listPerson) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.taxCalculate()));
			totalTax += person.taxCalculate();
		}
		
		System.out.println("");
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));
	}

}
