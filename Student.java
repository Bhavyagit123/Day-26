package com.codegnan.stringexamples;

import java.util.Scanner;

public class Student {
	private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;

        return this.id == other.id && this.name.equals(other.name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id1 = sc.nextInt();
        sc.nextLine();
        String name1 = sc.nextLine();

        int id2 = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();

        Student s1 = new Student(id1, name1);
        Student s2 = new Student(id2, name2);

        if (s1.equals(s2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }

}
