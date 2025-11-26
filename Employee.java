package com.codegnan.stringexamples;

import java.util.Scanner;

public class Employee {
	private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", ID: " + id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int id = sc.nextInt();

        Employee emp = new Employee(name, id);
        System.out.println(emp.toString());
    }

}
