package com.codegnan.stringexamples;

import java.util.Scanner;

public class Laptop {
	private String brand;
    private int ram;

    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop: " + brand + ", RAM: " + ram + " GB";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        int ram = sc.nextInt();

        Laptop laptop = new Laptop(brand, ram);
        System.out.println(laptop.toString());
    }

}
