package com.graymatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class Employee implements Comparable{
	
	private int empId;
	private String empName;
	private double empSalary;
	private String city;
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e= (Employee)o;
		//return this.getEmpId()-e.getEmpId();
		return this.getEmpName().compareTo(e.getEmpName());
		//return (int) (this.getEmpSalary()-e.getEmpSalary());
	}
	
	
	

}
