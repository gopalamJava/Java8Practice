package com.collectionswithlambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executor {

	public static void main(String[] args) {

		ArrayList<Employee> ar = new ArrayList<Employee>();

		ar.add(new Employee(123, "sai", 'o', "HR"));
		ar.add(new Employee(456, "yashu", 'a', "program"));
		ar.add(new Employee(789, "prasad", 'b', "sales"));
		ar.add(new Employee(98, "datta", 'o', "marketng"));
		ar.add(new Employee(86, "kamal", 'b', "demand"));

		//Using Comparable
		Collections.sort(ar);
		System.out.println("sorting based on Name with comparabl without lambda expressions\n");
		// sort based on Name
		for (Employee er : ar) {

			System.out.println(er.getName());
		}
		// sort based on employee id
		//usinf Comparator
	
		Collections.sort(ar, new EmployeidsortComparator());
		System.out.println("sorting based on employee id with comparato without  lambda expressions\n");
		for (Employee er : ar) {

			System.out.println(er.getEmpId());
		}
	}

}
