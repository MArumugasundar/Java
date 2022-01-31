package javaprogram;

public class ExceptionArray1 {

	public static void main(String[] args) {
		
	try {
		String[] arr={"sundar","arumugam"};
		arr[3]="arumugasundar";
	
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Arrayindaexoutofboundexception occurs");
		
	}
		

		// TODO Auto-generated method stub

	}

}
