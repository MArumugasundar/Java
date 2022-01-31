package javaprogram;

public class ExceptionString {

	public static void main(String[] args) {		
		String str="sundar";
	try {
		
		str.substring(9);
	}catch(StringIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("Exception occurs ");
	}
	finally {
		System.out.println(str.substring(3));
	}
	// TODO Auto-generated method stub

}

}
		// TODO Auto-generated method stub

	


