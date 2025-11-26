package com.codegnan.stringexamples;

import java.util.Scanner;

public class Employee1 {
	 private int empId;
	    private String department;

	    public Employee1(int empId, String department) {
	        this.empId = empId;
	        this.department = department;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;

	        if (obj == null || this.getClass() != obj.getClass())
	            return false;

	        Employee1 other = (Employee1) obj;

	        return this.empId == other.empId &&
	               this.department.equals(other.department);
	    }
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int empId1 = sc.nextInt();
	        String department1 = sc.next();

	        int empId2 = sc.nextInt();
	        String department2 = sc.next();

	        Employee1 e1 = new Employee1(empId1, department1);
	        Employee1 e2 = new Employee1(empId2, department2);

	        if (e1.equals(e2))
	            System.out.println("TRUE");
	        else
	            System.out.println("FALSE");
	    }

}
