package com.employee.details;

public class EmployeeDetailsService  extends HR{
	public String name;
	public int id;
	public String address;
	static String ceo="Raja Vara Prasad";
	
	public EmployeeDetailsService(String name, int id,String address,int salary ) {
		super(salary);
		this.name=name;
		this.id=id;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static String getCeo() {
		return ceo;
	}
	public static void setCeo(String ceo) {
		EmployeeDetailsService.ceo = ceo;
	}
	public String searchName(int val) {
		return this.name;
	}
}
