package com.collectionswithlambdaexpressions;

import java.util.Comparator;

public class EmployeidsortComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if (e1.getEmpId()>e2.getEmpId())
			return 1;
		
		return -1;
	}
	
	

}
