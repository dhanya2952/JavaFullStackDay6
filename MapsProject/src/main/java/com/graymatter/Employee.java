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


public class Employee implements Comparable
{
	
	private int empId;
	private String empName;
	private double empSalary;
	private String city;
	
//	Employee() {
//		super();
//	}
//	Employee(int empId, String empName, double empSalary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empSalary = empSalary;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public double getEmpSalary() {
//		return empSalary;
//	}
//	public void setEmpSalary(double empSalary) {
//		this.empSalary = empSalary;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
//	}
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
