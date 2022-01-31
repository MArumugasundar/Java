package javaprogram;

public class ClassB extends Class{
	public void nonabs() {
		System.out.println("this is the nrmal method of abstract method");
	}
	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.getClass();
		obj.nonabs();
		
}
}