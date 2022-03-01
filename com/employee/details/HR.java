package com.employee.details;

public class HR {
	private int salary;
	public float hike=0.1f;
	public HR(int salary) {
		this.salary=salary;
	}
	public int calculateSalary(){
		this.salary= (int)(salary +salary * hike);
		
		return this.salary;
	}
}
