package com.test.employee.profile;

import static org.junit.Assert.*;

import org.junit.Test;

import com.employee.details.EmployeeDetailsService;

public class EmployeeTest {

   
	@Test 
	public void addEmployeeTest() {
		EmployeeDetailsService emp = new EmployeeDetailsService("Venkata",1,"Rajahmundry",80000);
	    assertEquals("Venkata",emp.name);
	}
	
	@Test
    public void salaryEmployee(){
		EmployeeDetailsService emp1 = new EmployeeDetailsService("Raja",1,"Rajahmundry",80000);
	   
    	int sal = emp1.calculateSalary();
    	assertEquals(88000,sal);
    }
    
    @Test
    public void updateAddress() {
    	EmployeeDetailsService emp2 = new EmployeeDetailsService("Vara",1,"Rajahmundry",80000);
	    emp2.setAddress("Banglore");
	    assertEquals("Banglore",emp2.getAddress());
    }
    @Test
    public void searchNameTest() {
    	EmployeeDetailsService emp3= new EmployeeDetailsService("Prasad",2,"Rajahmundry",80000);
        String res = emp3.searchName(2);
        assertEquals("Prasad",res);
    }
    @Test 
    public void ceoTest() {
    	EmployeeDetailsService emp3= new EmployeeDetailsService("Prasad",2,"Rajahmundry",80000);
        String str = emp3.getCeo();
        assertEquals("Raja Vara Prasad",str);
    }
    
}
