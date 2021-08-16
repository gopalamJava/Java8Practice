package com.collectionswithoutlambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;

import com.collectionswithlambdaexpressions.Employee;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class Executor {

	public static void main(String[] args) {
	
		ArrayList<Employee> ar=new ArrayList<Employee>();
		
		ar.add(new Employee(123, "sai", 'o', "HR"));
		ar.add(new Employee(456, "yashu", 'a', "program"));
		ar.add(new Employee(789, "prasad", 'b', "sales"));
		ar.add(new Employee(98, "datta", 'o', "marketng"));
		ar.add(new Employee(86, "kamal", 'b', "demand"));
		
		Collections.sort(ar,(e1,e2)-> e1.getName().compareTo(e2.getName()));
		
		System.out.println("sorting based on Name using lambda expressions\n");
		for (Employee er : ar) {

			System.out.println(er.getName());
		}
		
		Collections.sort(ar,(e1,e2)-> e1.getEmpId()>e2.getEmpId()?1:-1);
		System.out.println("sorting based on employe id: using lambda expressions\n");
		for (Employee er : ar) {

			System.out.println(er.getEmpId());
		}
		
		
	}

}
