package javaprogram;

public class ExceptionArray {

	public static void main(String[] args) {
		try {
			int[]arr=new int[10];
			System.out.println(arr[20]);
			
			
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException occurs");
		}
	}
}