package javaprogram;

public class NumberFormat {



	public static void main(String[] args) {
		try {
		String s="123.33";
					int i = Integer.parseInt(s);
			
			
		}catch(NumberFormatException e) {
			System.out.println("Number format eception occurs");
		}
		
		// TODO Auto-generated method stub
		System.out.println("Done");

	}

}
