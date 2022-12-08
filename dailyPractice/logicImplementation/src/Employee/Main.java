package Employee;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.*;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee e1=new Employee("Akshay",29,87000);
		Employee e2=new Employee("Santosh",24,44000);
		Employee e3=new Employee("Aman",28,37000);
		Employee e4=new Employee("Avinash",23,55000);
		Employee e5=new Employee("Avinit",25,99000);
		Employee e6=new Employee("Rohit",28,37000);
		Employee e7=new Employee("Cristan",23,35000);
		Employee e8=new Employee("Anurag",21,66000);
		
		employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);
		employees.add(e5);employees.add(e6);employees.add(e7);employees.add(e8);
		
		System.out.println("\n-------Original Salary-------\n"+employees);

		List<Employee> incrementedSalary = employees.stream().map(e->{ 
		if(e.getAge()>25) {
			e.setSalary(e.getSalary()*1.10);
		}
		return e;
		}).collect(Collectors.toList());
		
		System.out.println("\n-------Incremented salary-------\n"+incrementedSalary);

		//Printing first 3 employees name of maximum salary from the list
		List<Employee> top3 = employees.stream()
				.sorted(comparingDouble(Employee::getSalary).reversed()).limit(3).collect(toList());

		System.out.println("\n-------top 3 salaried Employee-------");
		top3.forEach(System.out::println);


	}

}
