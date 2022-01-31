package javaprogram;

public class InHeritanceVehicle {
	private String make;
	private String color;
	private int year;
	private String model;
	
	
	
	public InHeritanceVehicle(String make, String color,int year,String model) {
		this.make=make;
		this.color=color;
		this.year=year;
		this.model=model;
	}
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("make:"+make);
		System.out.println("color:"+color);
		System.out.println("year:"+year);
		System.out.println("model:"+model);
	
		
	}
		


			

}
