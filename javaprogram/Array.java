package javaprogram;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		double [][] marks=new double[3][2];
		Scanner s=new Scanner(System.in);
		
		for(int i=1;i<=3;i++) {
			System.out.println("enter marks of studdent:"+(i));
			for(int j=1;j<=2;j++) {
				System.out.println("subject:"+(j));
				marks[i][j]=s.nextDouble();
			}
		}

		for(int i=1;i<=3;i++) {
			System.out.println("studdent:"+i);
			for(int j=1;j<=2;j++) {
				System.out.println("subject:"+j+":"+marks[i][j]);
			}
		}
	
		}
	
	/*	int[]
	 * =new int[10];
	
		x[0]=223;
		x[1]=23;
		int[] y= {24,32,43,12,43};
		System.out.println(x[0]);
		
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(y[2]);
		System.out.println(y[3]);
		// TODO Auto-generated method stub*/    */
		
		
		
		
		
		/*String[] fruits= {"apple","banana","orange"};
		fruits[1]="grapes";
		System.out.println("first element:"+fruits[0]);
		System.out.println("secod element:"+fruits[1]);
		System.out.println("third element:"+fruits[2]);*/
	/*	int[] myarray =new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter 5 integer of the array");
		for(i=0;i<5;i++) {
			myarray[i]=s.nextInt();
			System.out.println("elements of the array are:");
			for(i=0;i<5;i++)
			{
				System.out.println(myarray[i]);
			}
		}*/
		
	



