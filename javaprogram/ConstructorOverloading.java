package javaprogram;

public class ConstructorOverloading { 
	   protected String name;

	    protected void display() { 
	        System.out.println("This is a superclass method");
	    }
	}

	// subclass
	class Student extends  ConstructorOverloading {

	    public void printName() {
	        System.out.println("Name: " + name); // accessing protected variable of superclass in subclass
	    }
	}

	class Test {

	    public static void main(String[] args) {
	        // creating object of subclass
	        Student st = new Student();

	        // accessing protected variable and method of superclass using object of subclass
	        st.name = "John";
	        st.printName();
	    }
	}